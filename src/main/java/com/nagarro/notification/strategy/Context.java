package com.nagarro.notification.strategy;

import com.nagarro.notification.entity.Notification;

/**
 * @author arshpreetsingh
 *
 */
public class Context {
	
	INotificationStrategy strategy;
	
	public Context(INotificationStrategy strategy){
		this.strategy = strategy;
	}
	
	public void executeStrategy(Notification notification){
		strategy.Send(notification);
	}

}
