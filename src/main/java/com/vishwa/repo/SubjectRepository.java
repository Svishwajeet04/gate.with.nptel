package com.vishwa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vishwa.entities.Subject;
import com.vishwa.entities.enums.Stream;

public interface SubjectRepository extends CrudRepository<Subject, String> {

	List<Subject> findByStream(Stream stream);

}
