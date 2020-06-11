package com.spring.service;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional; 
	import com.spring.dao.UserIF;
import com.spring.model.User;
	 
	@Service
	@Transactional
	public class UsereServiceImpl implements UserService {

		@Autowired
	    private UserIF udao;
		
		 public void setUserIF(UserIF udao) {
		        this.udao = udao;
		    }
		
		
		public void addUser(User user) {
			udao.addUser(user);
			
		}

		
		public List<User> getAllUsers() {
			return udao.getAllUsers();
		}

		
		public void deleteUser(Integer userid) {
			udao.deleteUser(userid);
			
		}

		
		public User getUser(int userid) {
			return udao.getUser(userid);
	        
		}

		
		public User updateUser(User user) {
			return udao.updateUser(user);
		}
		
		  public User getUserByName(String username, String pass)
		  {
			  return udao.getUserByName(username,pass);
			  
		  }
	}
	 
	   

