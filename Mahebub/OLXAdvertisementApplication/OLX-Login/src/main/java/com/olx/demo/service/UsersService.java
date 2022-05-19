package com.olx.demo.service;

import com.olx.demo.entities.Users;
import com.olx.demo.exception.NoUsersFoundException;

public interface UsersService {
	void save(Users user);

    Users findByUsername(String username);
	
	// Create
	public Users addUser(Users users);

	public Users retrieveUser(Integer id) throws NoUsersFoundException;
	
}
