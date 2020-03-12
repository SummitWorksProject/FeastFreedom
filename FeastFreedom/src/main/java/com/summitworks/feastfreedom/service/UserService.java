package com.summitworks.feastfreedom.service;

import com.summitworks.feastfreedom.model.User;

public interface UserService {

	public void addUser(User user);

    User validateUser(User user);

}
