package com.vishwa.dtos;

import com.vishwa.entities.enums.Stream;

public class SubjectAddDto {

	private String name;

	private String image;

	private String id;

	private Stream stream;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getImage() {
		return image;
	}

	public final void setImage(String image) {
		this.image = image;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final Stream getStream() {
		return stream;
	}

	public final void setStream(Stream stream) {
		this.stream = stream;
	}

}
