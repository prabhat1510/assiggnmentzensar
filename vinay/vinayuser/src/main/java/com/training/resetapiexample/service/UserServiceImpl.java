package com.training.resetapiexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.resetapiexample.entity.User;
import com.training.resetapiexample.exception.NoUserFoundException;
import com.training.resetapiexample.exception.UserNotUpdated;
import com.training.resetapiexample.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User retrieveUser(Integer userId) throws NoUserFoundException {
		Optional<User> user=userRepository.findById(userId);
		if(user.isPresent())
		{
			return user.get();
		}
		else {
			throw new NoUserFoundException();
		}
	}

	@Override
	public String deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		return "User with Id"+userId+"is deleted Sucessfully";
	}

	@Override
	public String updateUser(User user) throws UserNotUpdated {
		Optional<User> user1=userRepository.findById(user.getUserId());
		if(user1.isPresent())
		{
			User u=userRepository.save(user);
			if(u!=null) {
				return "user updates successfully";
			}
			else {
				return "user not updated";
			}
		}
		else {
			throw new UserNotUpdated();
		}

		
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	
}