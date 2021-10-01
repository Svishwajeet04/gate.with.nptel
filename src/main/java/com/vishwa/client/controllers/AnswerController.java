package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

	@PutMapping("/questions/{qid}/addAnswer")
	public ResponseEntity<Object> addAnswer(@PathVariable String qid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@DeleteMapping("/answers/{id}")
	public ResponseEntity<Object> deleteAnswer(@PathVariable String id, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{id}")
	public ResponseEntity<Object> editAnswer(@PathVariable String id, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@GetMapping("/answers/{id}/comments")
	public ResponseEntity<Object> getAllComments(@PathVariable String id, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@GetMapping("/answers/{id}/comments/{cid}/replies")
	public ResponseEntity<Object> getAllreplies(@PathVariable String id, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PutMapping("/answers/{id}/comments/add")
	public ResponseEntity<Object> addComment(@PathVariable String id, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PutMapping("/answers/{id}/comments/{cid}/replies")
	public ResponseEntity<Object> addReply(@PathVariable String id, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@DeleteMapping("/answers/{id}/comments/{cid}")
	public ResponseEntity<Object> deleteComment(@PathVariable String id, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@DeleteMapping("/answers/{id}/comments/{cid}/replies/{rid}")
	public ResponseEntity<Object> deleteReply(@PathVariable String id, @PathVariable String cid,
			@PathVariable String rid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{id}/comments/{cid}/edit")
	public ResponseEntity<Object> editComment(@PathVariable String id, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{id}/comments/{cid}/replies/{rid}/edit")
	public ResponseEntity<Object> editReply(@PathVariable String id, @PathVariable String cid, @PathVariable String rid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

}
