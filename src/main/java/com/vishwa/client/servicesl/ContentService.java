package com.vishwa.client.servicesl;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.dtos.AddNotesDto;
import com.vishwa.entities.Notes;
import com.vishwa.entities.Subject;
import com.vishwa.entities.UserData;
import com.vishwa.entities.Video;
import com.vishwa.entities.enums.Stream;
import com.vishwa.entities.helpers.Subjectprogress;
import com.vishwa.repo.NotesRepository;
import com.vishwa.repo.SubjectRepository;
import com.vishwa.repo.SubjectprogressRepository;
import com.vishwa.repo.UserDataRepository;
import com.vishwa.repo.VideoRepository;
import com.vishwa.services.IdGenerators;

@Service
public class ContentService {

	@Autowired
	UserDataRepository udRepo;
	@Autowired
	VideoRepository vidRepo;
	@Autowired
	SubjectRepository sRepo;
	@Autowired
	IdGenerators ids;
	@Autowired
	SubjectprogressRepository spRepo;
	@Autowired
	NotesRepository nRepo;

	public Map<String, Object> markAsDone(Stream stream, String sid, String vid, String uid) {
		boolean flag = true;
		UserData ud = udRepo.findById(uid).get();
		Video v = vidRepo.findById(vid).get();
		Subject s = sRepo.findById(sid).get();
		List<Subjectprogress> sp = ud.getSubpro();
		for (int i = 0; i < sp.size(); i++) {
			if (sp.get(i).getSub().getId() == sid) {
				List<Video> vids = sp.get(i).getVids();
				vids.add(v);
				sp.get(i).setVids(vids);
				sp.get(i).setLastlocation(v.getUrl());
				flag = false;
				spRepo.save(sp.get(i));
				ud.setSubpro(sp);
			}
		}
		if (flag) {
			Subjectprogress p = new Subjectprogress();
			p.setLastlocation(v.getUrl());
			List<Video> vids = new LinkedList<>();
			vids.add(v);
			p.setVids(vids);
			p.setSub(s);
			p.setUser(ud);
			String id = ids.generate();
			while (sRepo.findById(id).isPresent())
				id = ids.generate();
			p.setId(id);
			sp.add(p);
			ud.setSubpro(sp);
			spRepo.save(p);
		}
		udRepo.save(ud);
		Map<String, Object> map = new HashMap<>();
		map.put("result", "successfully updated the progress");
		return map;
	}

	public List<Map<String, Object>> getNotes(Stream stream, String sid, String vid) {
		Video v = vidRepo.findById(vid).get();
		List<Notes> ns = nRepo.findByVideoAndIsDeleted(v , false);
		List<Map<String, Object>> res = new LinkedList<>();
		for (Notes n : ns) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", n.getId());
			map.put("date", n.getDate());
			// map.put("data", n.getData());
			map.put("heading", n.getHeading());
			map.put("comments", n.getComment());
			res.add(map);
		}
		return res;
	}

	public Map<String, Object> loadNotes(String nid) {
		Notes n = nRepo.findById(nid).get();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("id", n.getId());
		map.put("date", n.getDate());
		map.put("data", n.getData());
		map.put("heading", n.getHeading());
		map.put("comments", n.getComment());
		map.put("subject", n.getSubject().getName());
		map.put("videoUrl", n.getVideo().getId());
		map.put("videoTITLE", n.getVideo().getTitle());
		return map;
	}

	public AddNotesDto addNotes(AddNotesDto dto) {
		Notes n = new Notes();
		UserData ud = udRepo.findById(dto.getUser().getId()).get();
		Subject s = sRepo.findById(dto.getSubject().getId()).get();
		Video v = vidRepo.findById(dto.getVideo().getId()).get();
		n.setComment(dto.getComment());
		n.setData(dto.getData());
		n.setDate(new Date(0));
		n.setDeleted(false);
		n.setHeading(dto.getHeading());
		n.setUser(ud);
		n.setSubject(s);
		n.setVideo(v);

		String id = ids.generate();
		while (nRepo.findById(id).isPresent())
			id = ids.generate();
		n.setId(id);
		dto.setId(id);
		dto.setMessage("note has been added successfully");
		nRepo.save(n);
		return dto;
	}

	public Object deleteNotes(String nid) {
		Notes n = nRepo.findById(nid).get();
		n.setDeleted(true);
		nRepo.save(n);
		return "deleted successfully";
	}

}
