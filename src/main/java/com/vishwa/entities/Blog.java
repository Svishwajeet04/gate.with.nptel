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
	
	private boolean isDeleted;

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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
	
	

}
