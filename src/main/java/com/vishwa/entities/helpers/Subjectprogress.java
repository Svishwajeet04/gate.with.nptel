package com.vishwa.entities.helpers;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.vishwa.entities.Subject;
import com.vishwa.entities.UserData;
import com.vishwa.entities.Video;

import lombok.Data;

@Entity
@Data
public class Subjectprogress {

	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	private String lastlocation;

	@OneToOne(targetEntity = Subject.class)
	private Subject sub;

	@ManyToOne(targetEntity = UserData.class)
	private UserData user;

	@OneToMany(targetEntity = Video.class)
	@JoinTable(name = "subjectprogress_vids", joinColumns = {
			@JoinColumn(name = "subjectprogress_id") }, inverseJoinColumns = { @JoinColumn(name = "vids_id") })
	private List<Video> vids = new LinkedList<>();

}
