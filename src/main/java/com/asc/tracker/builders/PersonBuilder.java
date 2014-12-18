package com.asc.tracker.builders;

import com.asc.tracker.model.Person;

public class PersonBuilder {

  private String name;

  private String email;

  private String initials;

  private String username;

  public PersonBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public PersonBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public PersonBuilder withInitials(String initials) {
    this.initials = initials;
    return this;
  }

  public PersonBuilder withUsername(String username) {
    this.username = username;
    return this;
  }

  public Person createPerson() {
    return new Person(name, email, initials, username);
  }
}