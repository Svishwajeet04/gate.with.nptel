package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscussionController {

	@GetMapping("/questions/getNext20")
	public ResponseEntity<Object> getNext20(){
		return null;
	}

	@GetMapping("/answers/{id}")
	public ResponseEntity<Object> getAnswer(){
		return null;
	}

}

