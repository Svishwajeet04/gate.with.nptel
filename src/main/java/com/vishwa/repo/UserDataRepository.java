package com.vishwa.repo;

import org.springframework.data.repository.CrudRepository;

import com.vishwa.entities.UserData;

public interface UserDataRepository extends CrudRepository<UserData, String> {

}
