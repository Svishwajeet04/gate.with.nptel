package com.vishwa.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
public class AuthenticationRequest {

	private String password;

	private String email;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
