package com.nit.service;

import com.nit.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}
