package com.nagarro.notification.controller;

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
public class Register {

	@Autowired
	private SessionObject sessionObject;

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam String username) {
		ModelAndView mv = new ModelAndView();
		Session session = sessionObject.session();
		User user = new User();
		user.setUsername(username);
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		mv.setViewName("login");
		return mv;
	}

}
