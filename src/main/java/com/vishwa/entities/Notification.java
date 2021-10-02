package com.vishwa.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.vishwa.entities.enums.NotificationType;
import com.vishwa.entities.enums.RepType;
import com.vishwa.entities.helpers.NotificationStatus;

import lombok.Data;

@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private NotificationType notification;

	@ManyToOne(targetEntity = User.class)
	private User notificationFrom;

	@OneToMany(targetEntity = NotificationStatus.class, mappedBy = "notification")
	private List<NotificationStatus> broadCast = new LinkedList<>();

	private RepType objType;

	private String objId;

	private RepType objType2;

	private String Obj2Id;

	private boolean isDeleted;

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NotificationType getNotification() {
		return notification;
	}

	public void setNotification(NotificationType notification) {
		this.notification = notification;
	}

	public User getNotificationFrom() {
		return notificationFrom;
	}

	public void setNotificationFrom(User notificationFrom) {
		this.notificationFrom = notificationFrom;
	}

	public List<NotificationStatus> getBroadCast() {
		return broadCast;
	}

	public void setBroadCast(List<NotificationStatus> broadCast) {
		this.broadCast = broadCast;
	}

	public RepType getObjType() {
		return objType;
	}

	public void setObjType(RepType objType) {
		this.objType = objType;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public RepType getObjType2() {
		return objType2;
	}

	public void setObjType2(RepType objType2) {
		this.objType2 = objType2;
	}

	public String getObj2Id() {
		return Obj2Id;
	}

	public void setObj2Id(String obj2Id) {
		Obj2Id = obj2Id;
	}

}
