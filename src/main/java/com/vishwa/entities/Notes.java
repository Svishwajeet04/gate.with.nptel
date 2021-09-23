package com.vishwa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notes {

	@Column(columnDefinition = "MEDIUMTEXT")
	private String data;
	
	private String comment;

	private Date date;

	private String heading;

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToOne(targetEntity = Subject.class)
	private Subject subject;

	@ManyToOne(targetEntity = UserData.class)
	private UserData user;

	@ManyToOne(targetEntity = Video.class)
	private Video video;
}
