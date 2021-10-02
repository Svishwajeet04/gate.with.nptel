package com.vishwa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishwa.entities.Subject;
import com.vishwa.entities.Video;
import com.vishwa.entities.enums.Stream;

@Repository
public interface VideoRepository extends CrudRepository<Video, String>{

	List<Video> findAllByStreamAndSubjectAndIsDeleted(Stream stream, Subject s , boolean b);

}
