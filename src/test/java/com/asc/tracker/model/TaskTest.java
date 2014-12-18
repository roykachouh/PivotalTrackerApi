package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.TaskBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TaskTest {

  public static final int STORY_ID = 1;

  public static final String DESCRIPTION = "description";

  public static final boolean COMPLETE = true;

  public static final int POSITION = 1;

  Task task;

  @Before
  public void setup() {
    task = new TaskBuilder().withStoryId(STORY_ID)
        .withDescription(DESCRIPTION)
        .withComplete(COMPLETE)
        .withPosition(POSITION)
        .createTask();
  }

  @Test
  public void testStoryToJson() throws IOException {
    String taskJson = task.toJson();

    assertThat(taskJson).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(taskJson, new TypeReference<HashMap<String, Object>>() {
    });

    assertThat(result.get("story_id")).isEqualTo(STORY_ID);
    assertThat(result.get("description")).isEqualTo(DESCRIPTION);
    assertThat(result.get("complete")).isEqualTo(COMPLETE);
    assertThat(result.get("position")).isEqualTo(POSITION);
  }
}