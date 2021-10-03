package com.vishwa.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.admin.services.SubjectService;
import com.vishwa.dtos.SubjectAddDto;
import com.vishwa.entities.enums.Stream;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController

public class SubjectController {

	@Autowired
	SubjectService subjectService;

	@GetMapping("/admin/streams")
	public ResponseEntity<Object> getAllStreams() {
		return ResponseEntity.ok(subjectService.getStreams());
	}

	@GetMapping("/admin/streams/{stream}/subjects")
	public ResponseEntity<Object> getAllSubjects(@PathVariable String stream) {
		return ResponseEntity.ok(subjectService.getAllSubjects(stream));
	}

	@PostMapping("/admin/streams/{stream}/subjects")
	public ResponseEntity<Object> addSubject(@PathVariable Stream stream, @RequestBody SubjectAddDto dto) {
		return ResponseEntity.ok(subjectService.addSubject(dto));
	}

	@DeleteMapping("/admin/streams/{stream}/subjects/{sid}")
	public ResponseEntity<Object> deleteSubject(@PathVariable Stream stream, @PathVariable String sid) {
		return ResponseEntity.ok(subjectService.deleteSubject(stream, sid));
	}

}
