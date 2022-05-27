package com.example.olx.service;

import java.util.List;

//import com.example.olx.entities.College;
import com.example.olx.entities.User;

public interface UserService {
	
	public List<User> allusers(); 
	public User addUser(User users);
}