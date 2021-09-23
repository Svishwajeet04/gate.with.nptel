package com.vishwa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.vishwa.entities.enums.RepType;

@Entity

public class Report {

	private Date date;

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private String mid;

	private String msg;

	private RepType type;

	@ManyToOne(targetEntity = UserData.class)
	private UserData uid;

	private boolean admin;

	private int priority;

	private String adminMessage;

}
