package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscussionController {

	@GetMapping("/questions/getNext20")
	public ResponseEntity<Object> getNext20(@RequestHeader("Authorization") String access){
		return null;
	}

	@GetMapping("/answers/{id}")
	public ResponseEntity<Object> getAnswer(@RequestHeader("Authorization") String access){
		return null;
	}

}

