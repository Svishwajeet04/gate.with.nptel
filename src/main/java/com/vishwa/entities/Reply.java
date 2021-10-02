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

	private boolean isDeleted;

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Answer getAid() {
		return aid;
	}

	public void setAid(Answer aid) {
		this.aid = aid;
	}

	public Comment getCid() {
		return cid;
	}

	public void setCid(Comment cid) {
		this.cid = cid;
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

	public String getRdata() {
		return rdata;
	}

	public void setRdata(String rdata) {
		this.rdata = rdata;
	}

	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
	}

	public Scope getVisibilty() {
		return visibilty;
	}

	public void setVisibilty(Scope visibilty) {
		this.visibilty = visibilty;
	}

}
