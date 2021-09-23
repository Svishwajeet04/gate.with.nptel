package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


	@GetMapping("/users/progress")
	public ResponseEntity<Object> getAllProgressByUser(){
		return null ;
	}

	@GetMapping("/stream/{stream}/subjects")
	public ResponseEntity<Object> getAllSubjects(){
		return null;
	}



}
