package com.example.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.olx.entities.User;
import com.example.olx.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public User addUser(User users) {
		return repository.save(users);
	}

	@Override
	public List<User> allusers() {
		return (List<User>) repository.findAll();
	}

}
