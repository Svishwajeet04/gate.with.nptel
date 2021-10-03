package com.vishwa.dtos;

import com.vishwa.entities.Subject;
import com.vishwa.entities.enums.Stream;

public class AddVideoDto {

	private String description;

	private String id;

	private String message;

	private Stream stream;

	private Subject subject;

	private String title;

	private String url;

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Stream getStream() {
		return stream;
	}

	public Subject getSubject() {
		return subject;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
