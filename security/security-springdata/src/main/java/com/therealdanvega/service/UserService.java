package com.therealdanvega.service;

import com.therealdanvega.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}
