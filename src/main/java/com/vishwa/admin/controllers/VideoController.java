package com.vishwa.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.admin.services.VideoService;
import com.vishwa.entities.enums.Stream;

@RestController
public class VideoController {

	@Autowired
	VideoService vidService;

	@GetMapping("/admin/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> getVideos(@RequestHeader("authorization") String access, @PathVariable Stream stream,
			@PathVariable String sid) {
		return ResponseEntity.ok(vidService.getVideosByStreamAndSubject(stream, sid));
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
