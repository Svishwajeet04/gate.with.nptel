package com.vishwa.admin.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.entities.Subject;
import com.vishwa.entities.Video;
import com.vishwa.entities.enums.Stream;
import com.vishwa.repo.SubjectRepository;
import com.vishwa.repo.VideoRepository;

@Service
public class VideoService {

	@Autowired
	VideoRepository vidRepo;

	@Autowired
	SubjectRepository subRepo;

	public List<Map<String, Object>> getVideosByStreamAndSubject(Stream stream, String sid) {
		Subject s = subRepo.findById(sid).get();
		List<Video> vs = vidRepo.findAllByStreamAndSubjectAndIsDeleted(stream, s, false);
		List<Map<String, Object>> ls = new LinkedList<>();
		for(Video v : vs) {
			Map<String , Object> map = new HashMap<>();
			map.put("url", v.getUrl());
			map.put("des", v.getDescription());
			map.put("title", v.getTitle());
			map.put("tags", v.getTag());
			ls.add(map);
		}
		return ls;
	}
}
