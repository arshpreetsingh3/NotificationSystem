package com.nagarro.notification.factory;

import com.nagarro.notification.Services.EventService;
import com.nagarro.notification.Services.HolidayService;
import com.nagarro.notification.Services.NagarroNewsService;
import com.nagarro.notification.Services.NewPolicyService;
import com.nagarro.notification.Services.UrgentHelpService;

/**
 * @author arshpreetsingh
 *
 */
public class NotificationFactory {

	public INotification getInstance(String nortificationType) {

		if (nortificationType.equalsIgnoreCase("event")) {
			return new EventService();
		} else if (nortificationType.equalsIgnoreCase("holiday")) {
			return new HolidayService();
		} else if (nortificationType.equalsIgnoreCase("nagarroNews")) {
			return new NagarroNewsService();
		} else if (nortificationType.equalsIgnoreCase("newPolicy")) {
			return new NewPolicyService();
		} else if (nortificationType.equalsIgnoreCase("urgentHelp")) {
			return new UrgentHelpService();
		}
		return null;
	}

}
