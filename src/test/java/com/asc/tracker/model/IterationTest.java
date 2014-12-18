package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.IterationBuilder;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IterationTest {

  public static final int NUMBER = 1;

  public static final int PROJECT_ID = 1;

  public static final int LENGTH = 1;

  public static final String TEAM_STRENGTH = "1.0";

  public static final DateTime NOW = DateTime.now();

  public static final DateTime END = DateTime.now().plusWeeks(1);

  Integer[] STORY_IDS = { 1, 2, 3 };

  Iteration iteration;

  @Before
  public void setup() {

    iteration = new IterationBuilder().withNumber(NUMBER)
        .withProjectId(PROJECT_ID)
        .withLength(LENGTH)
        .withTeamStrength(TEAM_STRENGTH)
        .withStoryIds(Arrays.asList(STORY_IDS))
        .withStart(NOW)
        .withFinish(END)
        .createIteration();
  }

  @Test
  public void testPersonToJson() throws IOException {
    String iterationJSON = iteration.toJson();

    assertThat(iterationJSON).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(iterationJSON,
        new TypeReference<HashMap<String, Object>>() {
        });

    assertThat(result.get("number")).isEqualTo(NUMBER);
    assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
    assertThat(result.get("length")).isEqualTo(LENGTH);
    assertThat(result.get("team_strength")).isEqualTo(TEAM_STRENGTH);
    assertThat(result.get("story_ids")).isEqualTo(Arrays.asList(STORY_IDS));
    assertThat(result.get("start")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
    assertThat(result.get("finish")).isEqualTo(END.toString(CustomDateSerializer.formatter));
  }
}