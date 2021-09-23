package com.vishwa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.vishwa.entities.enums.Scope;

import lombok.Data;

@Entity
@Data
public class Reply {

	@ManyToOne(targetEntity = Answer.class)
	private Answer aid;
	@ManyToOne(targetEntity = Comment.class)
	private Comment cid;
	private Date date;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToOne(targetEntity = Question.class)
	private Question qid;

	private String rdata;

	@ManyToOne(targetEntity = User.class)
	private User uid;
	
	private Scope visibilty;

}
