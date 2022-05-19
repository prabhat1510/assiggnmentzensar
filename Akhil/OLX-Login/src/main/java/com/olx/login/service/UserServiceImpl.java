package com.olx.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.login.entities.Users;
import com.olx.login.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;

	@Override
	public Users addUser(Users users) {
		return repository.save(users);
	}

	@Override
	public List<Users> allusers() {
		return (List<Users>) repository.findAll();
	}

	

}
