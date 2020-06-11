package com.spring.service;

import java.util.List;

import com.spring.model.User;

public interface UserService  {

	     
	    public void addUser(User user);
	 
	    public List<User> getAllUsers();
	 
	    public void deleteUser(Integer userId);
	 
	    public User getUser(int Userid);
	 
	    public User updateUser(User user);
	    public User getUserByName(String username, String pass);							
}
	

