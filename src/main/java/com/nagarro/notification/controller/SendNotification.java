package com.nagarro.notification.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.factory.INotification;
import com.nagarro.notification.factory.NotificationFactory;
import com.nagarro.notification.save.object.SaveObjectToDB;

/**
 * @author arshpreetsingh
 *
 */
@Controller
public class SendNotification {

	@Autowired
	private SaveObjectToDB save;

	@Autowired
	NotificationFactory factory;

	@RequestMapping(value = "notification", method = RequestMethod.POST)
	public ModelAndView event(HttpServletRequest request, @RequestParam String subject, @RequestParam String body,
			@RequestParam String select) {

		Notification notification = new Notification(select, subject, body);

		INotification notificationService = factory.getInstance(notification.getType());
		notificationService.sendNotification(notification);

		save.saveObject(notification);

		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("homepage");
		 return mv;

	}

}