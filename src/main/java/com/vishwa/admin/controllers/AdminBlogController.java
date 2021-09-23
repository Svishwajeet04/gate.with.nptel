package com.vishwa.admin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminBlogController {

	
	@GetMapping("/admin/blogs")
	public ResponseEntity<Object> getAllBlogs() {
		return null;
	}
	
	@GetMapping("/admin/blogs/{bid}/data")
	public ResponseEntity<Object> getBlogData(){
		return null;
	}
	
	@PatchMapping("/admin/blogs/{bid}/data")
	public ResponseEntity<Object> editBlogData(){
		return null;
	}
	
	@PutMapping("/admin/blogs")
	public ResponseEntity<Object> addBlog(){
		return null; 
	}
	
	@DeleteMapping("/admin/blogs/{id}")
	public ResponseEntity<Object> deleteBlog(){
		return null;
	}
	
}
