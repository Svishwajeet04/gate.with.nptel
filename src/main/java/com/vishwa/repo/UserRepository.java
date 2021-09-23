package com.vishwa.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishwa.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByEmail(String username);

}
