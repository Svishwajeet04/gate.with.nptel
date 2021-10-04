package com.vishwa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishwa.entities.helpers.Subjectprogress;

@Repository
public interface SubjectprogressRepository extends CrudRepository<Subjectprogress, String> {

}
