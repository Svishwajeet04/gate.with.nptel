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
	private List<Tag> tag = new LinkedList<>();

	private String url;

	private String title;

	private String description;
	
	private boolean isDeleted;

	public final boolean isDeleted() {
		return isDeleted;
	}

	public final void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
