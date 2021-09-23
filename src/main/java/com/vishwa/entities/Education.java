package com.vishwa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Education {

	private String category;
	@Column(name = "fr")
	private String from;
	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;
	private String school;
	@Column(name = "too")
	private String to;
	@ManyToOne(targetEntity = UserData.class)
	private UserData user;

}
