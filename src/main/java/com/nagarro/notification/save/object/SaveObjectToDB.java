package com.nagarro.notification.save.object;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.notification.entity.Notification;
import com.nagarro.notification.entity.User;
import com.nagarro.notification.hibernate.session.SessionObject;

/**
 * @author arshpreetsingh
 *
 */
public class SaveObjectToDB {

	@Autowired
	private SessionObject sessionObject;

	public void saveObject(Notification notification) {
		Session session = sessionObject.session();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("from User");
		List<User> users = q.list();

		for (User user : users) {
			user.getNotification().add(notification);
			notification.getUser().add(user);
			session.save(user);
		}

		session.save(notification);
		tx.commit();
		session.close();
		System.out.println("\n" + notification);

	}
}
