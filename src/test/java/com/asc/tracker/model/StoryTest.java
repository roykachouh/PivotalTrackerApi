package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.StoryBuilder;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StoryTest {

  public static final int PROJECT_ID = 1;

  public static final String NAME = "name";

  public static final String DESCRIPTION = "description";

  public static final StoryType FEATURE = StoryType.feature;

  public static final CurrentState ACCEPTED = CurrentState.accepted;

  public static final BigDecimal ESTIMATE = new BigDecimal(2.0);

  public static final DateTime NOW = DateTime.now();

  public static final int REQUESTED_BY_ID = 1;

  public static final List<Integer> OWNER_IDS = Arrays.asList(1, 2, 3);

  public static final List<Integer> LABEL_IDS = Arrays.asList(1, 2, 3);

  public static final List<Integer> TASK_IDS = Arrays.asList(1, 2, 3);

  public static final List<Integer> FOLLOWER_IDS = Arrays.asList(1, 2, 3);

  public static final List<Integer> COMMENT_IDS = Arrays.asList(1, 2, 3);

  public static final int INTEGRATION_ID = 1;

  public static final String URL = "url";

  public static final String EXTERNAL_ID = "external_id";

  Story story;

  @Before
  public void setup() {
    story = new StoryBuilder().withProjectId(PROJECT_ID)
        .withName(NAME)
        .withDescription(DESCRIPTION)
        .withStoryType(FEATURE)
        .withCurrentState(ACCEPTED)
        .withEstimate(ESTIMATE)
        .withAcceptedAt(NOW)
        .withDeadline(NOW)
        .withRequestedById(REQUESTED_BY_ID)
        .withOwnerIds(OWNER_IDS)
        .withLabelIds(LABEL_IDS)
        .withTaskIds(TASK_IDS)
        .withFollowerIds(FOLLOWER_IDS)
        .withCommentIds(COMMENT_IDS)
        .withCreatedAt(NOW)
        .withUpdatedAt(NOW)
        .withIntegrationId(INTEGRATION_ID)
        .withExternalId(EXTERNAL_ID)
        .withUrl(URL)
        .createStory();
  }

  @Test
  public void testStoryToJson() throws IOException {
    String storyJson = story.toJson();

    assertThat(storyJson).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(storyJson, new TypeReference<HashMap<String, Object>>() {
    });

    assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
    assertThat(result.get("name")).isEqualTo(NAME);
    assertThat(result.get("description")).isEqualTo(DESCRIPTION);
    assertThat(result.get("story_type")).isEqualTo(FEATURE.toString());
    assertThat(result.get("current_state")).isEqualTo(ACCEPTED.toString());
    assertThat(String.valueOf(result.get("estimate"))).isEqualTo(ESTIMATE.toString());
    assertThat(result.get("accepted_at")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
    assertThat(result.get("deadline")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
    assertThat(result.get("requested_by_id")).isEqualTo(REQUESTED_BY_ID);
  }
}