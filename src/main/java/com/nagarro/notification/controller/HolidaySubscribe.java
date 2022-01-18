package com.nagarro.notification.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.notification.entity.User;
import com.nagarro.notification.hibernate.session.SessionObject;

/**
 * @author arshpreetsingh
 *
 */
@Controller
public class HolidaySubscribe {

	@Autowired
	private SessionObject sessionObject;

	@RequestMapping(value = "holidaySubscribe", method = RequestMethod.POST)
	public ModelAndView event(HttpServletRequest request, @RequestParam String holiday) {
		ModelAndView mv = new ModelAndView();
		HttpSession s = request.getSession();
		String username = (String) s.getAttribute("username");
		Session session = sessionObject.session();
		Query q = session.createQuery("from User a where a.username =:username");
		q.setParameter("username", username);
		User user = (User) q.uniqueResult();

		if (holiday.equalsIgnoreCase("Unsubscribed")) {
			holiday = "Subscribed";
			user.setHoliday(true);

		} else if (holiday.equalsIgnoreCase("subscribed")) {
			holiday = "Unsubscribed";
			user.setHoliday(false);
		}

		if (user.getEvent()==null || user.getEvent() == false) {
			mv.addObject("event", "Unsubscribed");
		} else {
			mv.addObject("event", "Subscribed");
		}

		if (user.getNagarroNews()==null || user.getNagarroNews() == false) {
			mv.addObject("nagarroNews", "Unsubscribed");
		} else {
			mv.addObject("nagarroNews", "Subscribed");
		}

		if(user.getNewPolicy()==null || user.getNewPolicy() == false){
			mv.addObject("newPolicy", "Unsubscribed");
		}else{
			mv.addObject("newPolicy", "Subscribed");
		}
		
		if (user.getUrgentHelp() == null || user.getUrgentHelp() == false ) {
			mv.addObject("urgentHelp", "Unsubscribed");
		} else {
			mv.addObject("urgentHelp", "Subscribed");
		}
		
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		System.out.println(user);
		mv.setViewName("subscribe");
		mv.addObject("holiday", holiday);
		return mv;
	}

}
