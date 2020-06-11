package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.model.User;


@Repository
public class UserImp implements UserIF {

	 @Autowired
	    private SessionFactory sessionFactory;
	
	
	public void addUser(User user) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	
	public List<User> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

		public void deleteUser(Integer uid) {
		 User user = (User) sessionFactory.getCurrentSession().load(
	                User.class, uid);
	        if (null != user) {
	            this.sessionFactory.getCurrentSession().delete(user);
	        }
		
	}

	
	public User updateUser(User user) {
		 sessionFactory.getCurrentSession().update(user);
	        return user;
	}

	
	public User getUser(int uid) {
		return (User) sessionFactory.getCurrentSession().get(
                User.class, uid);	}

	
	public User getUserByName(String username, String pass) {
		 Session s= sessionFactory.getCurrentSession();
		 
		 
         Criteria criteria = s.createCriteria(User.class);
         criteria.add(Restrictions.eq("uname", username));
         criteria.add(Restrictions.eq("upassword", pass));
          
         User user = (User) criteria.uniqueResult();
          
		 
		 
		//Query query = s.createQuery("select uname from User where uname = "+username);
		//User u = (User)query.uniqueResult();
		
	return user;
	}

	
	
	
	



}
