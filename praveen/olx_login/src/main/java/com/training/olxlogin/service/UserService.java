package com.training.olxlogin.service;

import org.springframework.stereotype.Service;

import com.training.olxlogin.entity.Users;

@Service
public interface UserService {

	// 1. Logins a user
	public String loginUser(String username, String password); // POST

	// 2. Logs out a user
	public boolean logoutUser(Integer id); // DELETE

	// 3. Registers an user
	public Users registerUser(Users user); // POST

	// 4. Returns user information
	public Users getUser(Integer id); // GET

}
