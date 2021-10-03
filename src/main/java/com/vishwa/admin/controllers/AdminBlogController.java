package com.vishwa.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.admin.services.AdminBlogService;
import com.vishwa.dtos.AddBlogDto;

@RestController
public class AdminBlogController {

	@Autowired
	AdminBlogService bservice;

	@GetMapping("/admin/blogs")
	public ResponseEntity<Object> getAllBlogs() {
		return ResponseEntity.ok(bservice.getAllBlogs());
	}

	@GetMapping("/admin/blogs/{bid}/data")
	public ResponseEntity<Object> getBlogData(@PathVariable String bid) {
		return ResponseEntity.ok(bservice.getBlogData(bid));
	}

	@PatchMapping(path = "/admin/blogs/{bid}/data", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> editBlogData(@PathVariable String bid, @RequestBody String bdata) {
		return ResponseEntity.ok(bservice.editBlog(bid, bdata));
	}

	@PutMapping(path = "/admin/blogs", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addBlog(@RequestBody AddBlogDto dto) {
		return ResponseEntity.ok(bservice.addBlog(dto));

	}

	@DeleteMapping("/admin/blogs/{bid}")
	public ResponseEntity<Object> deleteBlog(@PathVariable String bid) {
		return ResponseEntity.ok(bservice.deleteBlog(bid));
	}

}
