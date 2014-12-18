package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.PersonBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonTest {

  public static final String NAME = "name";

  public static final String EMAIL_EMAIL_COM = "email@email.com";

  public static final String RK = "rk";

  public static final String USERNAME = "username";

  Person person;

  @Before
  public void setup() {

    person = new PersonBuilder().withName(NAME)
        .withEmail(EMAIL_EMAIL_COM)
        .withInitials(RK)
        .withUsername(USERNAME)
        .createPerson();
  }

  @Test
  public void testPersonToJson() throws IOException {
    String personJson = person.toJson();

    assertThat(personJson).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(personJson, new TypeReference<HashMap<String, Object>>() {
    });

    assertThat(result.get("name")).isEqualTo(NAME);
    assertThat(result.get("email")).isEqualTo(EMAIL_EMAIL_COM);
    assertThat(result.get("initials")).isEqualTo(RK);
    assertThat(result.get("username")).isEqualTo(USERNAME);
  }
}