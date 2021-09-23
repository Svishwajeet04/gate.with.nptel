package com.vishwa.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.vishwa.entities.enums.GroupChatType;

import lombok.Data;

@Entity
@Data
public class GroupChat {
	
	@Id
	@Column(columnDefinition = "varchar(10)")
	private String id;

	private Date date;
	
	@ManyToOne(targetEntity = User.class)
	private User user;
	
	private GroupChatType type;
	
	private String chatData;
	
	
}
