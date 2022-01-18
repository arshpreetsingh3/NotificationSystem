package com.nagarro.notification.Services;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.factory.INotification;
import com.nagarro.notification.strategy.Context;
import com.nagarro.notification.strategy.impl.EmailStrategy;
import com.nagarro.notification.strategy.impl.EmployeePortalStrategy;

/**
 * @author arshpreetsingh
 *
 */
public class NagarroNewsService implements INotification{
	
	public Notification NagarroNews(){
		return new Notification();
	}

	public void sendNotification(Notification notification) {
		Context strategy = new Context(new EmailStrategy());
		strategy.executeStrategy(notification);
		strategy = new Context(new EmployeePortalStrategy());
		strategy.executeStrategy(notification);
	}

}
