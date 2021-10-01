package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

	@GetMapping("/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> getAllVideos(@PathVariable String stream, @PathVariable String sid,
			@RequestHeader("Authorization") String access) {
		return null;
	}

	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/mark")
	public ResponseEntity<Object> markAsDone(@PathVariable String stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access) {
		return null;
	}

	@GetMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> getNotes(@PathVariable String stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access) {
		return null;
	}

	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> addNotes(@PathVariable String stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access) {
		return null;
	}

	@DeleteMapping("/users/{uid}/notes/{nid}")
	public ResponseEntity<Object> deleteNotes(@PathVariable String uid, @PathVariable String nid,
			@RequestHeader("Authorization") String access) {
		return null;
	}
}
