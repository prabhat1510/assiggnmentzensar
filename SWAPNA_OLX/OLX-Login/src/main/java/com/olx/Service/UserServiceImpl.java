package com.olx.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.entities.Users;
import com.olx.repository.UserRepository;

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

	@Override
	public List<Users> allusers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users addUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	

}