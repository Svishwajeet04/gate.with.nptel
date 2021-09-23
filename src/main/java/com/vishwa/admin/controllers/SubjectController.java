package com.vishwa.admin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SubjectController {

	@GetMapping("/admin/streams")
	public ResponseEntity<Object> getAllStreams() {
		return null;
	}

	@GetMapping("/admin/streams/{stream}/subjects")
	public ResponseEntity<Object> getAllSubjects(@PathVariable String stream) {
		return null;
	}

	@PostMapping("/admin/streams/{stream}/subjects")
	public ResponseEntity<Object> addSubject(@PathVariable String Stream) {
		return null;
	}

	@DeleteMapping("/admin/streams/{stream}/subjects")
	public ResponseEntity<Object> deleteSubject(@PathVariable String Stream) {
		return null;
	}

}
