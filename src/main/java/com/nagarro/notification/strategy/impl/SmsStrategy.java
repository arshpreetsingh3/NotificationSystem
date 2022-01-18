package com.nagarro.notification.strategy.impl;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.strategy.INotificationStrategy;

/**
 * @author arshpreetsingh
 *
 */
public class SmsStrategy implements INotificationStrategy {

	public void Send(Notification notification) {
		System.out.println("SMS Sent:");
		System.out.println("Type : " + notification.getType());
		System.out.println("\n Subject : " + notification.getSubject());
		System.out.println("\n Body : " + notification.getBody());
	}

}
