package com.vishwa.entities;

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
import javax.persistence.Table;

@Entity
@Table(name = "grp")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@ManyToMany(targetEntity = UserData.class)
	@JoinTable(name = "group_members", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = {
			@JoinColumn(name = "members_id") })
	private List<UserData> members = new LinkedList<>();

	private String name;

	@ManyToMany(targetEntity = Question.class)
	@JoinTable(name = "group_shared", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = {
			@JoinColumn(name = "shared_id") })
	private List<Question> shared = new LinkedList<>();

	private int refreshToken;

}
