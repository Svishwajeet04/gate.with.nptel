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
	
	@ManyToMany(targetEntity = Group.class , mappedBy = "shared")
	private List<Group> group;

}
