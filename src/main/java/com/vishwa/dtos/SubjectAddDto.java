package com.vishwa.dtos;

import com.vishwa.entities.enums.Stream;

public class SubjectAddDto {

	private String name;

	private String image;

	private String id;

	private Stream stream;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	
	@Override
	public String toString() {
		return getName();
	}
}
