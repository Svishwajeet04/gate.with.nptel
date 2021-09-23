package com.vishwa.admin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

	@GetMapping("/admin/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> getVideos() {
		return null;
	}

	@PutMapping("/admin/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> addVideo() {
		return null;
	}

	@DeleteMapping("/admin/streams/{stream}/subjects/{sid}/videos/{vid}")
	public ResponseEntity<Object> deleteVideo() {
		return null;
	}

	@PatchMapping("/admin/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> editVideo() {
		return null;
	}
}
