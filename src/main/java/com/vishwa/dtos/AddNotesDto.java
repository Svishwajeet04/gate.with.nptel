package com.vishwa.dtos;

import java.sql.Date;

public class AddNotesDto {

	private SubjectAddDto subject;
	private AddVideoDto video;
	private UserRegisterDto user;
	private String heading;
	private String comment;
	private Date date;
	private String data;
	private String id;
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SubjectAddDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectAddDto subject) {
		this.subject = subject;
	}

	public AddVideoDto getVideo() {
		return video;
	}

	public void setVideo(AddVideoDto video) {
		this.video = video;
	}

	public UserRegisterDto getUser() {
		return user;
	}

	public void setUser(UserRegisterDto user) {
		this.user = user;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
