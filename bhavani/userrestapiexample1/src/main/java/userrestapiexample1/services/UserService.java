package userrestapiexample1.services;

import java.util.List;

import userrestapiexample1.entities.User;

public interface UserService {
	//Create
	
			public User addUser(User user);
			//Retrieve
			public User retrieveUser(Integer userId);
			//Delete
			public String deleteUser(Integer userId);
			
			//Update
			public String updateUser(User user);
			//Retrieve all books
			public List<User> getAllUsers();
		}

