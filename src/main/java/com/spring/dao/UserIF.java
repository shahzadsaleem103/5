package com.spring.dao;

import java.util.List;

import com.spring.model.User;



public interface UserIF {

	public void addUser(User user);
	 
    public List<User> getAllUsers();
 
    public void deleteUser(Integer userid);
 
    public User updateUser(User user);
 
    public User getUser(int employeeid);
   
    public User getUserByName(String username, String pass);
 //   public User login (User user);
}
