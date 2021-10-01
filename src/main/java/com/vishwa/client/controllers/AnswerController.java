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

	@DeleteMapping("/answers/{aid}")
	public ResponseEntity<Object> deleteAnswer(@PathVariable String aid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{aid}")
	public ResponseEntity<Object> editAnswer(@PathVariable String aid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@GetMapping("/answers/{aid}/comments")
	public ResponseEntity<Object> getAllComments(@PathVariable String aid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@GetMapping("/answers/{aid}/comments/{cid}/replies")
	public ResponseEntity<Object> getAllreplies(@PathVariable String aid, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PutMapping("/answers/{aid}/comments/add")
	public ResponseEntity<Object> addComment(@PathVariable String aid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PutMapping("/answers/{aid}/comments/{cid}/replies")
	public ResponseEntity<Object> addReply(@PathVariable String aid, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@DeleteMapping("/answers/{aid}/comments/{cid}")
	public ResponseEntity<Object> deleteComment(@PathVariable String aid, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@DeleteMapping("/answers/{aid}/comments/{cid}/replies/{rid}")
	public ResponseEntity<Object> deleteReply(@PathVariable String aid, @PathVariable String cid,
			@PathVariable String rid, @RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{aid}/comments/{cid}/edit")
	public ResponseEntity<Object> editComment(@PathVariable String aid, @PathVariable String cid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

	@PatchMapping("/answers/{aid}/comments/{cid}/replies/{rid}/edit")
	public ResponseEntity<Object> editReply(@PathVariable String aid, @PathVariable String cid, @PathVariable String rid,
			@RequestHeader("Authorization") String jwt) {
		return null;
	}

}
