package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class Person extends ModelBase {
	String name;
	String email;
	String initials;
	String username;

	public Person(String name, String email, String initials, String username) {
		this.name = name;
		this.email = email;
		this.initials = initials;
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
