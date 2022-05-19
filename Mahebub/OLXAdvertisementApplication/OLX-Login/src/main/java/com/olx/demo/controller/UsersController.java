package com.olx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.demo.entities.Users;
import com.olx.demo.exception.NoUsersFoundException;
import com.olx.demo.service.SecurityService;
import com.olx.demo.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	UsersService userService;
	
	@Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
	
	// Logins and  Logs out an user
	 @GetMapping("/login")
	    public String login(Model model, String error, String logout) {
	        if (securityService.isAuthenticated()) {
	            return "redirect:/";
	        }

	        if (error != null)
	            model.addAttribute("error", "Your username and password is invalid.");

	        if (logout != null)
	            model.addAttribute("message", "You have been logged out successfully.");

	        return "login";
	    }
	
	
	// Register an User
	 @GetMapping("/registration")
	    public String registration(Model model) {
	        if (securityService.isAuthenticated()) {
	            return "redirect:/";
	        }

	        model.addAttribute("userForm", new Users());

	        return "registration";
	    }

	    @PostMapping("/registration")
	    public String registration(@ModelAttribute("userForm") Users userForm, BindingResult bindingResult) {
	        userValidator.validate(userForm, bindingResult);

	        if (bindingResult.hasErrors()) {
	            return "registration";
	        }

	        userService.save(userForm);

	        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

	        return "redirect:/welcome";
	    }

	// Returns user information
	@GetMapping("user/{id}")
	public Users retrieveUsers(@PathVariable Integer id) throws NoUsersFoundException {

		return userService.retrieveUser(id);
	}
	
}