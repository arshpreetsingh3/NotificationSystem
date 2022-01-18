package com.nagarro.notification.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
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
public class Login {

	@Autowired
	private SessionObject sessionObject;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest request, @RequestParam String username) {

		HttpSession s = request.getSession();
		s.setAttribute("username", username);

		ModelAndView mv = new ModelAndView();

		Session session = sessionObject.session();
		Query q = session.createQuery("from User a where a.username=:username");
		q.setParameter("username", username);
		User user = (User) q.uniqueResult();

		System.out.println(user);

		if (user != null) {
			mv.setViewName("employeeHomepage");
			mv.addObject("username", username);

		} else {
			mv.setViewName("login");
		}
		session.close();
		return mv;
	}

}
