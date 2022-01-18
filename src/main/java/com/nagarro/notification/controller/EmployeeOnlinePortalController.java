package com.nagarro.notification.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.entity.User;
import com.nagarro.notification.hibernate.session.SessionObject;

/**
 * @author arshpreetsingh
 *
 */
@Controller
public class EmployeeOnlinePortalController {

	@Autowired
	private SessionObject sessionObject;

	@RequestMapping(value = "employeePortal", method = RequestMethod.POST)
	public ModelAndView sendSms(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeePortal");

		HttpSession s = request.getSession();
		String username = (String) s.getAttribute("username");
		Session session = sessionObject.session();
		Query q = session.createQuery("from User a where a.username =:username");
		q.setParameter("username", username);
		User user = (User) q.uniqueResult();

		Query q2 = session.createQuery("from Notification");
		List<Notification> notifications = q2.list();

		List<Notification> noti = new ArrayList<Notification>();

		for (Notification notification : notifications) {
			System.out.println("\n checking babe"+notification);
			List<User> users = notification.getUser();
			for (User u : users) {
				if (u.getUsername().equalsIgnoreCase(username)) {
					String type = notification.getType();
					if (type.equalsIgnoreCase("event")) {
						if (user.getEvent()) {
							noti.add(notification);
						}

					} else if (type.equalsIgnoreCase("holiday")) {
						if (user.getHoliday()) {
							noti.add(notification);
						}
					} else if (type.equalsIgnoreCase("nagarroNews")) {
						if (user.getNagarroNews()) {
							noti.add(notification);
						}
					} else if (type.equalsIgnoreCase("newPolicy")) {
						if (user.getNewPolicy()) {
							noti.add(notification);
						}
					}
				}
			}
		}

		mv.addObject("notifications", noti);
		return mv;

	}

}
