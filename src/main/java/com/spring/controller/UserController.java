package com.spring.controller;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class UserController {
	
	
	 private static final Logger logger = Logger
	            .getLogger(UserController.class);
	 
	    public UserController() {
	        System.out.println("UserController()");
	    }
	    
	   
	 

	    @Autowired
	    private UserService userService;
	    
	    // to get login credential
	    @RequestMapping(value = "/", method = RequestMethod.GET)
	    public ModelAndView showLogin(ModelAndView mav) {
	    logger.info("insie log mapping and showlogin method");
	    	User user = new User();
	    	mav.addObject("user", user);
	    	mav.setViewName("login2");
	     return mav;
	    }
	    
	 // to process login 
	    @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public ModelAndView processLogin(@ModelAttribute("user") User user) {
	    	logger.info("inside login mapping and process method");
	    	
	    	ModelAndView mav =new ModelAndView();
	    	// to get user after chekcing from db
	    	User use = userService.getUserByName(user.getUname(), user.getUpassword());
	    	if(use==null)
	    	{
	    		mav.setViewName("login2");
	    	}
	    	if(use.getUtype().equalsIgnoreCase("admin"))
	    	{   List<User> listUsers = userService.getAllUsers();
	        	mav.addObject("listUsers", listUsers);
		    	mav.setViewName("home2");
		    
	    	}
	    	else {
	    		
	    		 List<User> listUsers = userService.getAllUsers();
	 	        mav.addObject("listUsers", listUsers);
	    		mav.setViewName("user");
	    	}
	     return mav;
	    }
	    
	 // to list users for admin
	    @RequestMapping(value = "/home")
	    public ModelAndView listUsers(ModelAndView model) throws IOException {
	        List<User> listUsers = userService.getAllUsers();
	        model.addObject("listUsers", listUsers);
	        model.setViewName("home2");
	        return model;
	    }
	    
	    
	 // to list users for user ======:)
	    @RequestMapping(value = "/user")
	    public ModelAndView listUser(ModelAndView model) throws IOException {
	        List<User> listUsers = userService.getAllUsers();
	        model.addObject("listUsers", listUsers);
	        model.setViewName("user");
	        return model;
	    }
	 
	 // to new user entry
	    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
	    public ModelAndView newContact(ModelAndView model) {
	    	User user = new User();
	        model.addObject("user", user);
	        model.setViewName("UserForm");
	        return model;
	    }
	 
	 // to process new entry or update
	    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	    public ModelAndView saveUser(@ModelAttribute User user) {
	        if (user.getUid() == 0) { 
	        	userService.addUser(user);
	        } else {
	        	userService.updateUser(user);
	        }
	        return new ModelAndView("redirect:/");
	    }
	 
	 // to deletion
	    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	    public ModelAndView deleteuser(HttpServletRequest request) {
	        int uid = Integer.parseInt(request.getParameter("id"));
	        userService.deleteUser(uid);
	        return new ModelAndView("redirect:/");
	    }
	 
	 // to edition existing user
	    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
	    public ModelAndView editContact(HttpServletRequest request) {
	        int uid = Integer.parseInt(request.getParameter("id"));
	        User user = userService.getUser(uid);
	        ModelAndView model = new ModelAndView("UserForm");
	        model.addObject("user", user);
	 
	        return model;
	    }
	 
	}
	


