package com.training.restuserapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.restuserapi.entities.User;
import com.training.restuserapi.exception.NoUserFoundException;
import com.training.restuserapi.exception.UserNotUpdated;
import com.training.restuserapi.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User retriveUser(Integer userId) throws NoUserFoundException {
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
