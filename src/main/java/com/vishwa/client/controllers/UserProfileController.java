package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

	@GetMapping("/users/{id}/profile/data")
	public ResponseEntity<Object> getProfileData() {
		return null;
	}

	@GetMapping("/users/{id}/profile/asked")
	public ResponseEntity<Object> getAskedQuestions() {
		return null;
	}

	@GetMapping("/users/{id}/profile/answered")
	public ResponseEntity<Object> getAnsweredQuestions() {
		return null;
	}

	@GetMapping("/users/{id}/profile/followers")
	public ResponseEntity<Object> getFollowersData() {
		return null;
	}

	@GetMapping("/users/{id}/profile/followings")
	public ResponseEntity<Object> getFollowingData() {
		return null;
	}

	@GetMapping("/users/{id}/profile/groups")
	public ResponseEntity<Object> getGroupData() {
		return null;
	}

	@PatchMapping("/users/{id}/profile/edit")
	public ResponseEntity<Object> editUserInfo() {
		return null;
	}

	@PutMapping("/users/{id}/sendRequest/{uid}")
	public ResponseEntity<Object> sendRequest() {
		return null;
	}

	@DeleteMapping("/users/{id}/removeRequest/{uid}")
	public ResponseEntity<Object> removeRequest() {
		return null;
	}

	@PutMapping("/users/{id}/addFollower/{uid}")
	public ResponseEntity<Object> addFollower() {
		return null;
	}

	@DeleteMapping("/users/{id}/removeFollower/{uid}")
	public ResponseEntity<Object> removeFollower() {
		return null;
	}

	@GetMapping("/users/{id}/reports")
	public ResponseEntity<Object> getAllReportsByUser() {
		return null;
	}

	@GetMapping("/users/{id}/reports/{rid}")
	public ResponseEntity<Object> getReportData() {
		return null;
	}

}
