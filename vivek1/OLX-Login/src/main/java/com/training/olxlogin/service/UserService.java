package com.training.olxlogin.service;

import java.util.List;

import com.training.olxlogin.entities.Users;

public interface UserService {
	
	public List<Users> allusers(); 
	public Users addUser(Users users);

}