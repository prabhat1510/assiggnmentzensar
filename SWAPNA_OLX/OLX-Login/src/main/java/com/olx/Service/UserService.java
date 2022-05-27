package com.olx.Service;

import java.util.List;

import com.olx.entities.Users;

public interface UserService {
	
	public List<Users> allusers(); 
	public Users addUser(Users users);

}