package com.vishwa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.vishwa.entities.enums.Stream;

@Entity

public class Subject {
	@Id
	@Column(unique = true, columnDefinition = "VARCHAR(10)")
	private String id;

	@Column(columnDefinition = "MEDIUMTEXT")
	private String image;

	private String name;

	private Stream stream;

	@OneToMany(targetEntity = Video.class, mappedBy = "subject")
	private List<Video> videos = new ArrayList<>();

}
