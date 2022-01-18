package com.nagarro.notification.strategy.impl;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.strategy.INotificationStrategy;

/**
 * @author arshpreetsingh
 *
 */
public class EmployeePortalStrategy implements INotificationStrategy{

	public void Send(Notification notification) {
		System.out.println("PortalNotification Sent:");
	}

}
