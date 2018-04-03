package org.manas.server.tomcat.services;

import org.manas.server.tomcat.model.User;
import org.springframework.stereotype.Component;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService{

	@Override
	public User getUser() {
		return new User("1", "Manas");
	}

}
