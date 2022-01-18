package com.nagarro.notification.strategy;

import com.nagarro.notification.entity.Notification;

/**
 * @author arshpreetsingh
 *
 */
public interface INotificationStrategy {

	public void Send(Notification notification);

}
