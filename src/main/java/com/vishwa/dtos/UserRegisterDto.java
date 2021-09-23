package com.vishwa.dtos;

import com.vishwa.entities.User;
import com.vishwa.entities.enums.Stream;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRegisterDto {

	private String email;
	private String id;
	private String name;
	private String password;
	private String role;
	private Stream stream;
	private static int active = 1;
	
	public User toUser() {
		User user = new User();
		user.setId(id);
		user.setActive(active);
		user.setEmail(email.toLowerCase());
		user.setPass(password);
		user.setStream(stream);
		user.setRole(role);
		user.setName(name);
		return user;

	}
}
