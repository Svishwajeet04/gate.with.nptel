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
@Data
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
}
