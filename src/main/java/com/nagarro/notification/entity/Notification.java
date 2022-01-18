package com.nagarro.notification.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author arshpreetsingh
 *
 */
@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String subject;
	private String body;
	@ManyToMany
	private List<User> users = new ArrayList<User>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<User> getUser() {
		return users;
	}

	public void setUser(List<User> user) {
		this.users = user;
	}

	public Notification() {

	}

	public Notification(String type, String subject, String body) {
		this.type = type;
		this.subject = subject;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", type=" + type + ", subject=" + subject + ", body=" + body + ", user="
				+ users + "]";
	}

}
