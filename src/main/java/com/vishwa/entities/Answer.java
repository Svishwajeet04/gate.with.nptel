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
}
