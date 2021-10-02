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
	
	private boolean isDeleted;

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	private Scope visibility;

	public Answer getAid() {
		return aid;
	}

	public void setAid(Answer aid) {
		this.aid = aid;
	}

	public String getCdata() {
		return cdata;
	}

	public void setCdata(String cdata) {
		this.cdata = cdata;
	}

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

	public Question getQid() {
		return qid;
	}

	public void setQid(Question qid) {
		this.qid = qid;
	}

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Scope getVisibility() {
		return visibility;
	}

	public void setVisibility(Scope visibility) {
		this.visibility = visibility;
	}
	
	
}
