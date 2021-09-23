package com.vishwa.dtos;

import lombok.Data;

@Data
public class AuthenticationResponse {
	private final String jwtToken;
	private final String role;
}
