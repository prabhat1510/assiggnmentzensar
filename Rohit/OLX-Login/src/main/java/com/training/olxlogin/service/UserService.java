package com.training.olxlogin.service;

import java.util.List;

import com.training.olxlogin.entities.Users;
import com.training.olxlogin.exception.NoUserFoundException;
public interface UserService {
	public Users addUser(Users user);
	
	public Users retriveUser(Integer id) throws NoUserFoundException;
	
	public String deleteUser(Integer id);

	public List<Users> getAllUsers();
	

}
