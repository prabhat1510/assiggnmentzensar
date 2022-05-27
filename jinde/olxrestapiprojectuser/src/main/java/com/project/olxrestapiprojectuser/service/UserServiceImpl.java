package com.project.olxrestapiprojectuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.olxrestapiprojectuser.repository.UserRepository;

import olxuserrestapiprojectuser.entities.Users;

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
