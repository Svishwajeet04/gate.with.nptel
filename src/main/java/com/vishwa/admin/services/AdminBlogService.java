package com.vishwa.admin.services;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.dtos.AddBlogDto;
import com.vishwa.entities.Blog;
import com.vishwa.repo.BlogRepository;
import com.vishwa.services.IdGenerators;

@Service

public class AdminBlogService {

	@Autowired
	BlogRepository brepo;

	@Autowired
	IdGenerators ids;

	public List<Map<String, Object>> getAllBlogs() {
		List<Blog> bs = brepo.findAllByIsDeleted(false);
		List<Map<String, Object>> res = new LinkedList<>();
		for (Blog b : bs) {
			Map<String, Object> map = new HashMap<>();
			map.put("heading", b.getHeading());
			map.put("date", b.getDate());
//			map.put("data", b.getData());
			map.put("id", b.getId());
			res.add(map);
		}
		return res;
	}

	public Map<String, Object> getBlogData(String bid) {
		Blog b = brepo.findById(bid).get();
		Map<String, Object> map = new HashMap<>();
		map.put("heading", b.getHeading());
		map.put("date", b.getDate());
		map.put("data", b.getData());
		map.put("id", b.getId());
		return map;
	}

	public String deleteBlog(String bid) {
		Blog b = brepo.findById(bid).get();
		b.setDeleted(true);
		brepo.save(b);
		return "deleted " + bid + " successfully";
	}

	public String editBlog(String bid, String bdata) {
		Blog b = brepo.findById(bid).get();
		b.setData(bdata);
		brepo.save(b);
		return "saved changes successfully";
	}

	public AddBlogDto addBlog(AddBlogDto dto) {
		Blog b = new Blog();
		b.setData(dto.getData());
		b.setDate(new Date(0));
		b.setDeleted(false);
		b.setHeading(dto.getHeading());
		String id = ids.generate();
		while (brepo.findById(id).isPresent()) {
			id = ids.generate();
		}
		b.setId(id);
		brepo.save(b);
		dto.setId(id);
		return dto;
	}

}
