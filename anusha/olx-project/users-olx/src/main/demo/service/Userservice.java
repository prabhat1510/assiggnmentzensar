package com.example.demo.service;

import java.util.List;

import com.example.demo.entites.Users;

public interface Userservice {
	public List<Users> allusers(); 
	public Users addUser(Users users);


}