package com.training.olxlogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxlogin.entities.Users;
import com.training.olxlogin.repository.UserRepository;

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
