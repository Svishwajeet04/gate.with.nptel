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
	@JoinTable(name = "user_data_requested", joinColumns = {
			@JoinColumn(name = "user_data_id") }, inverseJoinColumns = { @JoinColumn(name = "requestSent_id") })
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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Question> getAsked() {
		return asked;
	}

	public void setAsked(List<Question> asked) {
		this.asked = asked;
	}

	public String getBgpic() {
		return bgpic;
	}

	public void setBgpic(String bgpic) {
		this.bgpic = bgpic;
	}

	public List<Education> getEdu() {
		return edu;
	}

	public void setEdu(List<Education> edu) {
		this.edu = edu;
	}

	public List<User> getRequestSent() {
		return requestSent;
	}

	public void setRequestSent(List<User> requestSent) {
		this.requestSent = requestSent;
	}

	public List<User> getRequestRecieved() {
		return requestRecieved;
	}

	public void setRequestRecieved(List<User> requestRecieved) {
		this.requestRecieved = requestRecieved;
	}

	public List<User> getFollower() {
		return follower;
	}

	public void setFollower(List<User> follower) {
		this.follower = follower;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPropic() {
		return propic;
	}

	public void setPropic(String propic) {
		this.propic = propic;
	}

	public List<Report> getReps() {
		return reps;
	}

	public void setReps(List<Report> reps) {
		this.reps = reps;
	}

	public List<Question> getSaved() {
		return saved;
	}

	public void setSaved(List<Question> saved) {
		this.saved = saved;
	}

	public List<Subjectprogress> getSubpro() {
		return subpro;
	}

	public void setSubpro(List<Subjectprogress> subpro) {
		this.subpro = subpro;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
