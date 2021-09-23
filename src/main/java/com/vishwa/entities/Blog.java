package com.vishwa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {

	@Column(columnDefinition = "MEDIUMTEXT")
	private String data;

	private Date date;

	private String heading;

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

}
