package userrestapiexample1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userrestapiexample1.entities.User;
import userrestapiexample1.services.UserService;


	@RestController
	@RequestMapping(value="/api/v2/user")
	public class UserController {

		@Autowired
		UserService userService;
		
		//Create
		@PostMapping("/adduser")
		public User addUser(@RequestBody User user) {
			return userService.addUser(user);
		}
		
		//Delete
		@DeleteMapping("/removeuser/{userId}")
		public String deleteUser(@PathVariable Integer userId) {
			
			return userService.deleteUser(userId);
		}
		
		//Update
		@PutMapping("/updateuser")
		public String updateUser(@RequestBody User user) {
			return userService.updateUser(user);
		}
		
	}


