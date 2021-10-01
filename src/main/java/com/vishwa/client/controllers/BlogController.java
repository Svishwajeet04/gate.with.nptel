package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@GetMapping("/blogs")
	public ResponseEntity<Object> getAllBlogs() {
		return null;
	}

	@GetMapping("/blogs/{bid}/data")
	public ResponseEntity<Object> getBlogData(@PathVariable String bid){
		return null;
	}
}
