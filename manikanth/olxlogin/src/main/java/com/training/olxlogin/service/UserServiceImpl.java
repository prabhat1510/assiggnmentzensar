package com.training.olxlogin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxlogin.entity.Users;
import com.training.olxlogin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepo;

	// 1. Logins a user
	@Override
	public String loginUser(String username, String password) {
		Users user = userrepo.findUserByUsernameAndPassword(username, password);
		if (user != null) {
			// Username as auth-tokan
			return username;
		} else {
			return null;
		}
	}

	// 2. Logs out a user
	@Override
	public boolean logoutUser(Integer id) {
		return false;
	}

	// 3. Registers an user
	@Override
	public Users registerUser(Users user) {
		return userrepo.save(user);
	}

	// 4. Returns user information
	@Override
	public Users getUser(Integer id) {
		Optional<Users> user = userrepo.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

}
