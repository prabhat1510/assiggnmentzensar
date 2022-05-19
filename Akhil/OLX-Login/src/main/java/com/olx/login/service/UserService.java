package com.olx.login.service;

import java.util.List;

import com.olx.login.entities.Users;

public interface UserService {
	
	public List<Users> allusers(); 
	public Users addUser(Users users);

}
