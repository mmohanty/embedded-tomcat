package org.manas.server.tomcat.config;

import org.manas.server.tomcat.services.UserService;
import org.manas.server.tomcat.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.manas.server.tomcat")
public class SpringConfig {

	//@Bean(name="UserServiceImpl")
	public UserService clickCounter() {
		return new UserServiceImpl();
	}

}
