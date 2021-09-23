package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	@GetMapping("/questions/{qid}")
	public ResponseEntity<Object> getQuestion(){
		return null;
	}
	
	@GetMapping("/questions/getLatestTime")
	public ResponseEntity<Object> getLatestTime(){
		return null;
	}
	
	
	@PutMapping("/questions/add")
	public ResponseEntity<Object> addQuestion(){
		return null;
	}
	
	@DeleteMapping("/questions/{qid}")
	public ResponseEntity<Object> deleteQuestion(){
		return null ;
	}
	
	@PatchMapping("/questions/{qid}")
	public ResponseEntity<Object> editQuestion(){
		return null;
	}
	
	@PutMapping("")
	public ResponseEntity<Object> shareQuestionInGroup(){
		return null;
	}
	
	@PutMapping("/questions/{qid}/save")
	public ResponseEntity<Object> saveQuestion(){
		return null;
	}
}
