package com.summitworks.feastfreedom.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.summitworks.feastfreedom.model.User;


@Repository("UserDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}


	public User validateUser(User user) {
		return (User) sessionFactory.getCurrentSession().get(User.class, user.getId());
	}
	
	
}
