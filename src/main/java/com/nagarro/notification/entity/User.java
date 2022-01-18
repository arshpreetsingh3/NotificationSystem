package com.nagarro.notification.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author arshpreetsingh
 *
 */
@Entity
public class User {

	@Id
	private String username;
	private Boolean event;
	private Boolean holiday;
	private Boolean nagarroNews;
	private Boolean newPolicy;
	private Boolean urgentHelp;

	@OneToMany(mappedBy = "users", cascade = { CascadeType.ALL })
	private List<Notification> notifications = new ArrayList<Notification>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getEvent() {
		return event;
	}

	public void setEvent(Boolean event) {
		this.event = event;
	}

	public Boolean getHoliday() {
		return holiday;
	}

	public void setHoliday(Boolean holiday) {
		this.holiday = holiday;
	}

	public Boolean getNagarroNews() {
		return nagarroNews;
	}

	public void setNagarroNews(Boolean nagarroNews) {
		this.nagarroNews = nagarroNews;
	}

	public Boolean getNewPolicy() {
		return newPolicy;
	}

	public void setNewPolicy(Boolean newPolicy) {
		this.newPolicy = newPolicy;
	}

	public Boolean getUrgentHelp() {
		return urgentHelp;
	}

	public void setUrgentHelp(Boolean urgentHelp) {
		this.urgentHelp = urgentHelp;
	}

	public List<Notification> getNotification() {
		return notifications;
	}

	public void setNotification(List<Notification> noti) {
		this.notifications = noti;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", event=" + event + ", holiday=" + holiday + ", nagarroNews="
				+ nagarroNews + ", newPolicy=" + newPolicy + ", urgentHelp=" + urgentHelp + "" + ",notifications="
				+ notifications + "]";
	}

}
