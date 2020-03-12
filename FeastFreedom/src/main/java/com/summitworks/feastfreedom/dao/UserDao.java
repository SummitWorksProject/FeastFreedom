package com.summitworks.feastfreedom.dao;

import com.summitworks.feastfreedom.model.User;

public interface UserDao {

	public void addUser(User user);
	
	User validateUser(User user);
}
