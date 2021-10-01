package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/users/progress")
	public ResponseEntity<Object> getAllProgressByUser(@RequestHeader("Authorization") String access) {
		return null;
	}

	@GetMapping("/stream/{stream}/subjects")
	public ResponseEntity<Object> getAllSubjects(@PathVariable String stream,
			@RequestHeader(name = "Authorization", required = false) String access) {
		return null;
	}

	@GetMapping("/streams")
	public ResponseEntity<Object> getStreams(@RequestHeader(name = "Authorization", required = false) String access) {
		return null;
	}

}
