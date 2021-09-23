package com.vishwa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.vishwa.entities.enums.Scope;

@Entity
public class Answer {

	@Column(columnDefinition = "MEDIUMTEXT")
	private String adata;
	@OneToMany(targetEntity = Comment.class, mappedBy = "aid")
	private List<Comment> coms = new ArrayList<>();
	private Date date;

	@ManyToMany(targetEntity = User.class)
	@JoinTable(name = "answer_dislikes", joinColumns = { @JoinColumn(name = "answer_id") }, inverseJoinColumns = {
			@JoinColumn(name = "dislikes_id") })
	private List<User> dislikes = new LinkedList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToMany(targetEntity = User.class)
	@JoinTable(name = "answer_likes", joinColumns = { @JoinColumn(name = "answer_id") }, inverseJoinColumns = {
			@JoinColumn(name = "likes_id") })
	private List<User> likes = new LinkedList<>();

	@ManyToOne(targetEntity = Question.class)
	private Question qid;

	@OneToMany(targetEntity = Report.class)
	@JoinTable(name = "answer_reps", joinColumns = { @JoinColumn(name = "answer_id") }, inverseJoinColumns = {
			@JoinColumn(name = "reps_id") })
	private List<Report> reps = new LinkedList<>();

	@ManyToMany(targetEntity = Tag.class)
	@JoinTable(name = "answer_tags", joinColumns = { @JoinColumn(name = "answer_id") }, inverseJoinColumns = {
			@JoinColumn(name = "tags_id") })
	private List<Tag> tags = new LinkedList<>();

	@ManyToOne(targetEntity = UserData.class)
	private UserData uid;

	private Scope visibilty;

	@ManyToMany(targetEntity = Group.class )
	private List<Group> shared = new LinkedList<>();

	public String getAdata() {
		return adata;
	}

	public void setAdata(String adata) {
		this.adata = adata;
	}

	public List<Comment> getComs() {
		return coms;
	}

	public void setComs(List<Comment> coms) {
		this.coms = coms;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<User> getDislikes() {
		return dislikes;
	}

	public void setDislikes(List<User> dislikes) {
		this.dislikes = dislikes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<User> getLikes() {
		return likes;
	}

	public void setLikes(List<User> likes) {
		this.likes = likes;
	}

	public Question getQid() {
		return qid;
	}

	public void setQid(Question qid) {
		this.qid = qid;
	}

	public List<Report> getReps() {
		return reps;
	}

	public void setReps(List<Report> reps) {
		this.reps = reps;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public UserData getUid() {
		return uid;
	}

	public void setUid(UserData uid) {
		this.uid = uid;
	}

	public Scope getVisibilty() {
		return visibilty;
	}

	public void setVisibilty(Scope visibilty) {
		this.visibilty = visibilty;
	}

	public List<Group> getShared() {
		return shared;
	}

	public void setShared(List<Group> shared) {
		this.shared = shared;
	}
	
	
}
