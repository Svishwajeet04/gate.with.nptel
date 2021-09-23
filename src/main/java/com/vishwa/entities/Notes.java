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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
	
	
}
