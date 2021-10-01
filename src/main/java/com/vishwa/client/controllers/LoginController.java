package com.vishwa.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.client.services.LoginService;
import com.vishwa.dtos.AuthenticationRequest;
import com.vishwa.dtos.UserRegisterDto;

@RestController
public class LoginController {

	@Autowired
	private AuthenticationManager am;
	@Autowired
	LoginService lservice;

	@PostMapping(path = "/authenticate", consumes = "application/json")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest ar) throws Exception {
		try {
			am.authenticate(new UsernamePasswordAuthenticationToken(ar.getEmail(), ar.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("invalid Username or Password");
		}
		return ResponseEntity.ok(lservice.createAuthenticationToken(ar));

	}

	@PostMapping(consumes = "application/json", path = "/register")
	public ResponseEntity<Object> createUser(@RequestBody UserRegisterDto user) {
		user = lservice.createUser(user);
		if (user != null)
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		else {
			return new ResponseEntity<>("email already exists", HttpStatus.FORBIDDEN);
		}
	}

}
