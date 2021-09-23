package com.vishwa.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.vishwa.entities.enums.Stream;

@Entity

public class Video {
	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;
	
	private Stream stream;
	
	@ManyToOne(targetEntity = Subject.class)
	private Subject subject;
	
	@ManyToMany(targetEntity = Tag.class)
	@JoinTable(name = "video_tag", joinColumns = { @JoinColumn(name = "vid_id") }, inverseJoinColumns = {
			@JoinColumn(name = "tag_id") })
	private List<Tag> tag = new LinkedList<Tag>();
	
	private String url;
	
	private String title;
	
	private String description;
	
}
