package com.vishwa.admin.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vishwa.dtos.SubjectAddDto;
import com.vishwa.entities.Subject;
import com.vishwa.entities.enums.Stream;
import com.vishwa.repo.SubjectRepository;
import com.vishwa.services.IdGenerators;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepo;

	@Autowired
	IdGenerators ids;

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

	public Map<String, Object> addSubject(SubjectAddDto dto) {
		Subject sub = new Subject();
		sub.setDeleted(false);
		sub.setImage(dto.getImage());
		sub.setName(dto.getName());
		sub.setStream(dto.getStream());
		String id = ids.generate();
		while (subjectRepo.findById(id).isPresent()) {
			id = ids.generate();
		}
		sub.setId(id);
		
		subjectRepo.save(sub);
		Map<String, Object> map = new HashMap<>();
		map.put("result", "saved successfully");
		map.put("name", sub.getName());
		map.put("id", sub.getId());
		return map;
	}

	public String deleteSubject(Stream stream, String sid) {
		Subject s = subjectRepo.findById(sid).get();
		if (s.isDeleted() == false) {
			s.setDeleted(true);
		}
		subjectRepo.save(s);
		return "deleted " + sid + " successfully";
	}
}
