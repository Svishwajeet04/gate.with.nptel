package com.vishwa.client.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.entities.Subject;
import com.vishwa.entities.UserData;
import com.vishwa.entities.enums.Stream;
import com.vishwa.entities.helpers.Subjectprogress;
import com.vishwa.repo.SubjectRepository;
import com.vishwa.repo.UserDataRepository;

@Service
public class CourseService {

	@Autowired
	UserDataRepository userDataRepo;

	@Autowired
	SubjectRepository subjectRepo;

	public List<Map<String, Object>> getAllProgressByUser(String id) {
		UserData d = userDataRepo.findById(id).get();
		List<Subjectprogress> sp = d.getSubpro();
		List<Map<String, Object>> ls = new LinkedList<>();
		for (Subjectprogress p : sp) {
			Map<String, Object> res = new HashMap<>();
			res.put("subject", p.getSub());
			res.put("videos", p.getVids());
			res.put("lastLocation", p.getLastlocation());
			ls.add(res);
		}
		return ls;
	}

	public Stream[] getStreams() {
		return Stream.values();
	}

	public List<Map<String, Object>> getAllSubjects(String stream) {
		List<Map<String, Object>> res = new LinkedList<>();
		List<Subject> ls;
		if (stream != null)
			ls = subjectRepo.findByStream(Stream.valueOf(stream));
		else
			ls = (List<Subject>) subjectRepo.findAll();

		for (Subject s : ls) {
			Map<String, Object> map = new HashMap<>();
			map.put("name", s.getName());
			map.put("id", s.getId());
			map.put("image", s.getImage());
			map.put("stream", s.getStream());
			map.put("totalVideos", s.getVideos().size());
			res.add(map);
		}
		
		return res;
	}

}
