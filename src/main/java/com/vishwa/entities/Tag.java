package com.vishwa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private String tag;

	public Tag() {
		super();
	}

	public String getId() {
		return id;
	}

	public String getTag() {
		return tag;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
