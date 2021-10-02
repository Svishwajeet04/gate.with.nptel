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
import com.vishwa.entities.enums.Stream;

@Entity

public class Question {

	@OneToMany(targetEntity = Answer.class, mappedBy = "qid")
	private List<Answer> aids = new ArrayList<>();
	private Date date;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private String qdata;

	@OneToMany(targetEntity = Report.class)
	@JoinTable(name = "question_reps", joinColumns = { @JoinColumn(name = "question_id") }, inverseJoinColumns = {
			@JoinColumn(name = "reps_id") })
	private List<Report> reps = new LinkedList<>();

	private Stream stream;

	@ManyToOne(targetEntity = Subject.class)
	private Subject subject;

	@ManyToMany(targetEntity = Tag.class)
	@JoinTable(name = "question_tags", joinColumns = { @JoinColumn(name = "question_id") }, inverseJoinColumns = {
			@JoinColumn(name = "tags_id") })
	private List<Tag> tags = new LinkedList<>();

	@ManyToOne(targetEntity = UserData.class)
	private UserData uid;

	@ManyToOne(targetEntity = Video.class)
	private Video video;

	private Scope visibility;
	
	private boolean isDeleted ;
	

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@ManyToMany(targetEntity = Group.class , mappedBy = "shared")
	private List<Group> group;

	public List<Answer> getAids() {
		return aids;
	}

	public void setAids(List<Answer> aids) {
		this.aids = aids;
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

	public String getQdata() {
		return qdata;
	}

	public void setQdata(String qdata) {
		this.qdata = qdata;
	}

	public List<Report> getReps() {
		return reps;
	}

	public void setReps(List<Report> reps) {
		this.reps = reps;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Scope getVisibility() {
		return visibility;
	}

	public void setVisibility(Scope visibility) {
		this.visibility = visibility;
	}

	public List<Group> getGroup() {
		return group;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}
	
	

}
