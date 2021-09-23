package com.vishwa.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.vishwa.entities.helpers.Address;
import com.vishwa.entities.helpers.Subjectprogress;

import lombok.Data;

@Entity

@Data
public class UserData {

	private String about;

	@Embedded
	private Address adr;
	@OneToMany(targetEntity = Answer.class, mappedBy = "uid")
	List<Answer> answers = new LinkedList<>();
	@OneToMany(targetEntity = Question.class, mappedBy = "uid")
	List<Question> asked = new LinkedList<>();

	@Column(columnDefinition = "MEDIUMTEXT")
	private String bgpic;

	@OneToMany(targetEntity = Education.class, mappedBy = "user")
	private List<Education> edu = new ArrayList<>();
	
	@OneToMany(targetEntity = User.class)
	@JoinTable(name = "user_data_requested", joinColumns = { @JoinColumn(name = "user_data_id") }, inverseJoinColumns = {
			@JoinColumn(name = "requestSent_id") })
	private List<User> requestSent = new ArrayList<>();
	
	@OneToMany(targetEntity = User.class)
	@JoinTable(name = "user_data_Recieved", joinColumns = { @JoinColumn(name = "user_data_id") }, inverseJoinColumns = {
			@JoinColumn(name = "requestRecieved_id") })
	private List<User> requestRecieved = new ArrayList<>();
	

	@OneToMany(targetEntity = User.class)
	@JoinTable(name = "user_data_follower", joinColumns = { @JoinColumn(name = "user_data_id") }, inverseJoinColumns = {
			@JoinColumn(name = "follower_id") })
	private List<User> follower = new ArrayList<>();

	@OneToMany(targetEntity = User.class)
	@JoinTable(name = "user_data_following", joinColumns = {
			@JoinColumn(name = "user_data_id") }, inverseJoinColumns = { @JoinColumn(name = "following_id") })
	private List<User> following = new ArrayList<>();

	@ManyToMany(targetEntity = Group.class, mappedBy = "members")
	private List<Group> groups;

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@OneToMany(targetEntity = Notes.class, mappedBy = "user")
	private List<Notes> notes = new LinkedList<>();

	private String phone;

	@Column(columnDefinition = "MEDIUMTEXT")
	private String propic;

	@OneToMany(targetEntity = Report.class, mappedBy = "uid")
	List<Report> reps = new LinkedList<>();

	@OneToMany(targetEntity = Question.class)
	List<Question> saved = new LinkedList<>();

	@OneToMany(targetEntity = Subjectprogress.class, mappedBy = "user")
	private List<Subjectprogress> subpro = new LinkedList<>();

	@OneToOne(targetEntity = User.class)
	private User user;

}
