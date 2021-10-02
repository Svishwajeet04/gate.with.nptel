package com.vishwa.dtos;

import com.vishwa.entities.enums.Stream;

public class AuthenticationResponse {
	private String jwtToken;
	private String role;
	private String name;
	private String email;
	private String id;
	private Stream stream;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public AuthenticationResponse(String jwt, String role2) {
		jwtToken = jwt;
		role = role2;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public String getRole() {
		return role;
	}

}
