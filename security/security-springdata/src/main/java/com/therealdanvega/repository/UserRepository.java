package com.therealdanvega.repository;

import org.springframework.data.repository.CrudRepository;

import com.therealdanvega.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
