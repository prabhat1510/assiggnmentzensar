package com.project.olxrestapiprojectuser.service;

import java.util.List;



import olxuserrestapiprojectuser.entities.Users;

public interface UserService {
	public List<Users> allusers(); 
	public Users addUser(Users users);
}
