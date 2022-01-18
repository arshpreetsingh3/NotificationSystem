package com.nagarro.notification.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nagarro.notification.factory.NotificationFactory;
import com.nagarro.notification.hibernate.session.SessionObject;
import com.nagarro.notification.save.object.SaveObjectToDB;

@Configuration
@EnableScheduling
public class AppConfig {

	@Bean
	public SessionObject sessionObject() {
		return new SessionObject();
	}

//	@Bean
//	public User userObject() {
//		return new User();
//	}

	@Bean
	public NotificationFactory factory() {
		return new NotificationFactory();
	}
	
	@Bean
	public SaveObjectToDB  save(){
		return new SaveObjectToDB();
	}

//	@Bean
//	public GetUser get(){
//		return new GetUser();
//	}
	
}
