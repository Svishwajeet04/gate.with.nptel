package com.vishwa.entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.vishwa.entities.enums.Scope;

import lombok.Data;

@Entity
@Data
public class Comment {

	@ManyToOne(targetEntity = Answer.class)
	private Answer aid;
	
	private String cdata;

	private Date date;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToOne(targetEntity = Question.class)
	private Question qid;

	@OneToMany(targetEntity = Reply.class, mappedBy = "cid")
	private List<Reply> replies = new LinkedList<>();

	@ManyToOne(targetEntity = User.class)
	private User user;

	private Scope visibility;
}
