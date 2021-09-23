package com.vishwa.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@GetMapping("/users/{id}/notification")
	public ResponseEntity<Object> getUnreadNotifications(){
		return null;
	}
	
	@GetMapping("/users/{id}/allNotification")
	public ResponseEntity<Object> getAllNotifications(@RequestParam int day){
		return null;
	}
	
	@PatchMapping("/users/{id}/notification/{notificationId}/read")
	public ResponseEntity<Object> markNotificationRead(){
		return null;
	}
	
	@PutMapping("/users/{id}/notification/add")
	public ResponseEntity<Object> addNotification(){
		return null;
	}
	
	@DeleteMapping("/users/{id}/notification/{nid}/delete")
	public ResponseEntity<Object> deleteNotification(){
		return null;
	}
	
}
