package com.vishwa.entities.helpers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.vishwa.entities.Notification;
import com.vishwa.entities.User;
import com.vishwa.entities.enums.Status;

@Entity
public class NotificationStatus {

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToOne(targetEntity = User.class)
	private User user;

	private Status status;

	@ManyToOne(targetEntity = Notification.class)
	private Notification notification;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

}
