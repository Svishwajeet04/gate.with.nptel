package com.vishwa.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.admin.services.VideoService;
import com.vishwa.client.servicesl.ContentService;
import com.vishwa.dtos.AddNotesDto;
import com.vishwa.entities.enums.Stream;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ContentController {

	@Autowired
	ContentService cService;

	@Autowired
	private VideoService vidService;

	@GetMapping("/streams/{stream}/subjects/{sid}/videos")
	public ResponseEntity<Object> getAllVideos(@PathVariable Stream stream, @PathVariable String sid,
			@RequestHeader("Authorization") String access) {
		return ResponseEntity.ok(vidService.getVideosByStreamAndSubject(stream, sid));
	}

	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/mark/{uid}")
	public ResponseEntity<Object> markAsDone(@PathVariable Stream stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access, @PathVariable String uid) {
		return ResponseEntity.ok(cService.markAsDone(stream, sid, vid, uid));
	}

	@GetMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> getNotes(@PathVariable Stream stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access) {
		return ResponseEntity.ok(cService.getNotes(stream , sid , vid));
	}
	
	@GetMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes/{nid}")
	public ResponseEntity<Object> loadNotes(@PathVariable Stream stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access , @PathVariable String nid) {
		return ResponseEntity.ok(cService.loadNotes(nid));
	}

	@PutMapping("/streams/{stream}/subjects/{sid}/videos/{vid}/notes")
	public ResponseEntity<Object> addNotes(@PathVariable String stream, @PathVariable String sid,
			@PathVariable String vid, @RequestHeader("Authorization") String access , @RequestBody AddNotesDto dto ) {
		return ResponseEntity.ok(cService.addNotes(dto));
	}

	@DeleteMapping("/users/{uid}/notes/{nid}")
	public ResponseEntity<Object> deleteNotes(@PathVariable String uid, @PathVariable String nid,
			@RequestHeader("Authorization") String access) {
		return ResponseEntity.ok(cService.deleteNotes(nid));
	}
}
