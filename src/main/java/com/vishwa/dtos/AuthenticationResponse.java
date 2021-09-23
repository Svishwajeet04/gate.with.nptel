package com.vishwa.dtos;

public class AuthenticationResponse {
	private String jwtToken;
	private String role;

	public AuthenticationResponse(String jwt, String role2) {
		jwtToken = jwt ;
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
