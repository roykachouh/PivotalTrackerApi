package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.LabelBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LabelTest {

  public static final String NAME = "name";

  public static final int PROJECT_ID = 1;

  Label label;

  @Before
  public void setup() {
    label = new LabelBuilder().withName(NAME).withProjectId(PROJECT_ID).createLabel();
  }

  @Test
  public void testStoryToJson() throws IOException {
    String labelJson = label.toJson();

    assertThat(labelJson).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(labelJson, new TypeReference<HashMap<String, Object>>() {
    });

    assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
    assertThat(result.get("name")).isEqualTo(NAME);
  }
}