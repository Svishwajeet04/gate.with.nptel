package com.vishwa.client.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.client.services.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/users/{id}/progress")
	public ResponseEntity<Object> getAllProgressByUser(@RequestHeader("Authorization") String access,
			@PathVariable String id) {

		List<Map<String, Object>> ls = courseService.getAllProgressByUser(id);
		return ResponseEntity.ok(ls);
	}

	@GetMapping("/stream/{stream}/subjects")
	public ResponseEntity<Object> getAllSubjects(@PathVariable(required = false) String stream,
			@RequestHeader(name = "Authorization", required = false) String access) {
		return ResponseEntity.ok(courseService.getAllSubjects(stream));
	}

	@GetMapping("/streams")
	public ResponseEntity<Object> getStreams(@RequestHeader(name = "Authorization", required = false) String access) {
		return ResponseEntity.ok(courseService.getStreams());
	}

}
