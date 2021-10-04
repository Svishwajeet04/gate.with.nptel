package com.vishwa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vishwa.entities.Notes;
import com.vishwa.entities.Video;

public interface NotesRepository extends CrudRepository<Notes, String> {

	List<Notes> findByVideoAndIsDeleted(Video v, boolean b);

}
