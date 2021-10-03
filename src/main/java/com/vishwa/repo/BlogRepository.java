package com.vishwa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishwa.entities.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog, String> {

	List<Blog> findAllByIsDeleted(boolean b);

}
