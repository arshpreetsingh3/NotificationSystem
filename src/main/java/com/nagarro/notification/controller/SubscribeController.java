package com.nagarro.notification.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.notification.entity.User;
import com.nagarro.notification.hibernate.session.SessionObject;

/**
 * @author arshpreetsingh
 *
 */
@Controller
public class SubscribeController {

	@Autowired
	private SessionObject sessionObject;

	@RequestMapping(value = "subscribe", method = RequestMethod.POST)
	public ModelAndView subscribeUser(HttpServletRequest request) {
		HttpSession s = request.getSession();
		String username = (String) s.getAttribute("username");
		Session session = sessionObject.session();
		Query q = session.createQuery("from User a where a.username =:username");
		q.setParameter("username", username);
		User user = (User) q.uniqueResult();
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("subscribe");

		if (user.getEvent() == null || user.getEvent() == false) {
			mv.addObject("event", "UnSubscribed");
		} else {
			mv.addObject("event", "Subscribed");
		}

		if (user.getHoliday() == null || user.getHoliday() == false) {
			mv.addObject("holiday", "UnSubscribed");
		} else {
			mv.addObject("holiday", "Subscribed");
		}
		if (user.getNagarroNews() == null || user.getNagarroNews() == false) {
			mv.addObject("nagarroNews", "UnSubscribed");
		} else {
			mv.addObject("nagarroNews", "Subscribed");
		}
		if (user.getNewPolicy() == null || user.getNewPolicy() == false) {
			mv.addObject("newPolicy", "UnSubscribed");
		} else {
			mv.addObject("newPolicy", "Subscribed");
		}
		if (user.getUrgentHelp() == null || user.getUrgentHelp() == false) {
			mv.addObject("urgentHelp", "UnSubscribed");
		} else {
			mv.addObject("urgentHelp", "Subscribed");
		}

		return mv;
	}

}
