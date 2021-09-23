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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RepType getType() {
		return type;
	}

	public void setType(RepType type) {
		this.type = type;
	}

	public UserData getUid() {
		return uid;
	}

	public void setUid(UserData uid) {
		this.uid = uid;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getAdminMessage() {
		return adminMessage;
	}

	public void setAdminMessage(String adminMessage) {
		this.adminMessage = adminMessage;
	}
	
	

}
