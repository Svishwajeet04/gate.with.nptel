package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

	@GetMapping("/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> getAllVideos(){
		return null;
	}
	
	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/mark")
	public ResponseEntity<Object> markAsDone(){
		return null;
	}
	
	@GetMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> getNotes(){
		return null;
	}
	
	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> addNotes(){
		return null;
	}
	
	@DeleteMapping("/users/{uid}/notes/{nid}")
	public ResponseEntity<Object> deleteNotes(){
		return null;
	}
}
