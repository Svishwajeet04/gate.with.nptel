package com.vishwa.admin.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.dtos.AddVideoDto;
import com.vishwa.entities.Subject;
import com.vishwa.entities.Video;
import com.vishwa.entities.enums.Stream;
import com.vishwa.repo.SubjectRepository;
import com.vishwa.repo.VideoRepository;
import com.vishwa.services.IdGenerators;

@Service
public class VideoService {

	@Autowired
	VideoRepository vidRepo;

	@Autowired
	SubjectRepository subRepo;

	@Autowired
	IdGenerators ids;

	public List<Map<String, Object>> getVideosByStreamAndSubject(Stream stream, String sid) {
		Subject s = subRepo.findById(sid).get();
		List<Video> vs = vidRepo.findAllByStreamAndSubjectAndIsDeleted(stream, s, false);
		List<Map<String, Object>> ls = new LinkedList<>();
		for (Video v : vs) {
			Map<String, Object> map = new HashMap<>();
			map.put("url", v.getUrl());
			map.put("des", v.getDescription());
			map.put("title", v.getTitle());
			map.put("tags", v.getTag());
			ls.add(map);
		}
		return ls;
	}

	public AddVideoDto addVideo(AddVideoDto dto, Stream stream, String sid) {

		Subject s = subRepo.findById(sid).get();
		Video vid = new Video();
		vid.setDeleted(false);
		vid.setDescription(dto.getDescription());
		vid.setTitle(dto.getTitle());
		vid.setSubject(s);
		vid.setUrl(dto.getUrl());
		vid.setStream(stream);
		vid.setTag(null);

		String id = ids.generate();
		while (vidRepo.findById(id).isPresent())
			id = ids.generate();

		vid.setId(id);
		vidRepo.save(vid);
		dto.setId(id);
		dto.setMessage("video saved successfully");

		return dto;

	}

	public String deleteVideo(Stream stream, String sid, String vid) {

		Video v = vidRepo.findById(vid).get();
		if (v.isDeleted() == false) {
			v.setDeleted(true);
		}
		vidRepo.save(v);
		return "video deleted successfully";
	}
}
