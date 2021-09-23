package com.vishwa.dtos;

import com.vishwa.entities.User;
import com.vishwa.entities.enums.Stream;

import lombok.Data;
import lombok.NoArgsConstructor;

public class UserRegisterDto {

	private String email;
	private String id;
	private String name;
	private String password;
	private String role;
	private Stream stream;
	private static int active = 1;
	
	

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



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public Stream getStream() {
		return stream;
	}



	public void setStream(Stream stream) {
		this.stream = stream;
	}



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



	public static int getActive() {
		return active;
	}



	public static void setActive(int active) {
		UserRegisterDto.active = active;
	}
}
