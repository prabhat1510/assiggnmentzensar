package com.training.olxusers.service;

import java.util.List;

import com.training.olxusers.entity.Users;
import com.training.olxusers.exception.NoUserFoundException;

public interface UserService {
public Users addUser(Users users);
	
	public Users retriveUser(Integer id) throws NoUserFoundException;
	
	public String deleteUser(Integer id);

	public List<Users> getAllUsers();

}
