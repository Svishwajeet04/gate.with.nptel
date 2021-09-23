package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {



	@PutMapping("/questions/{qid}/addAnswer")
	public ResponseEntity<Object> addAnswer(){
		return null;
	}

	@DeleteMapping("/answers/{id}")
	public ResponseEntity<Object> deleteAnswer(){
		return null ;
	}

	@PatchMapping("/answers/{id}")
	public ResponseEntity<Object> editAnswer(){
		return null;
	}

	@GetMapping("/answers/{id}/comments")
	public ResponseEntity<Object> getAllComments(){
		return null;
	}

	@GetMapping("/answers/{id}/comments/{cid}/replies")
	public ResponseEntity<Object> getAllreplies(){
		return null ;
	}

	@PutMapping("/answers/{id}/comments/add")
	public ResponseEntity<Object> addComment(){
		return null;
	}

	@PutMapping("/answers/{id}/comments/{cid}/replies")
	public ResponseEntity<Object> addReply(){
		return null;
	}

	@DeleteMapping("/answers/{id}/comments/{cid}")
	public ResponseEntity<Object> deleteComment(){
		return null;
	}

	@DeleteMapping("/answers/{id}/comments/{cid}/replies/{rid}")
	public ResponseEntity<Object> deleteReply(){
		return null;
	}

	@PatchMapping("/answers/{id}/comments/{cid}/edit")
	public ResponseEntity<Object> editComment(){
		return null ;
	}

	@PatchMapping("/answers/{id}/comments/{cid}/replies/{rid}/edit")
	public ResponseEntity<Object> editReply(){
		return null ;
	}



}
