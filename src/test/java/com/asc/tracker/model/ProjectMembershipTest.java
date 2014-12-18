package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.ProjectMembershipBuilder;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProjectMembershipTest {

  public static final int PERSON_ID = 1;

  public static final int PROJECT_ID = 1;

  public static final Role MEMBER = Role.member;

  public static final String PROJECT_COLOR = "project_color";

  public static final DateTime NOW = DateTime.now();

  public static final boolean WANTS_COMMENT_NOTIFICATION_EMAILS = true;

  public static final boolean WILL_RECEIVE_MENTION_NOTIFICATIONS_OR_EMAILS = true;

  ProjectMembership projectMembership;

  @Before
  public void setup() {

    projectMembership = new ProjectMembershipBuilder().withPersonId(PERSON_ID)
        .withProjectId(PROJECT_ID)
        .withRole(MEMBER)
        .withProjectColor(PROJECT_COLOR)
        .withLastViewedAt(NOW)
        .withWantsCommentNotificationEmails(WANTS_COMMENT_NOTIFICATION_EMAILS)
        .withWillReceiveMentionNotificationsOrEmails(WILL_RECEIVE_MENTION_NOTIFICATIONS_OR_EMAILS)
        .createProjectMembership();
  }

  @Test
  public void testPersonToJson() throws IOException {
    String projectMembershipJSON = projectMembership.toJson();

    assertThat(projectMembershipJSON).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(projectMembershipJSON,
        new TypeReference<HashMap<String, Object>>() {
        });

    assertThat(result.get("person_id")).isEqualTo(PERSON_ID);
    assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
    assertThat(result.get("role")).isEqualTo(MEMBER.toString());
    assertThat(result.get("project_color")).isEqualTo(PROJECT_COLOR);
    assertThat(result.get("last_viewed_at")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
    assertThat(result.get("wants_comment_notification_emails")).isEqualTo(WANTS_COMMENT_NOTIFICATION_EMAILS);
    assertThat(result.get("will_receive_mention_notifications_or_emails")).isEqualTo(
        WILL_RECEIVE_MENTION_NOTIFICATIONS_OR_EMAILS);
  }
}