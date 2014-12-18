package com.asc.tracker.builders;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;
import com.asc.tracker.model.CurrentState;
import com.asc.tracker.model.Story;
import com.asc.tracker.model.StoryType;

public class StoryBuilder {

  private Integer projectId;

  private String name;

  private String description;

  private StoryType storyType;

  private CurrentState currentState;

  private BigDecimal estimate;

  private DateTime acceptedAt;

  private DateTime deadline;

  private Integer requestedById;

  private List<Integer> ownerIds;

  private List<Integer> taskIds;

  private List<Integer> followerIds;

  private List<Integer> commentIds;

  private List<Integer> labelIds;

  private Integer integrationId;

  private String externalId;

  private String url;

  private DateTime createdAt;

  private DateTime updatedAt;

  public StoryBuilder withCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public StoryBuilder withUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public StoryBuilder withProjectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  public StoryBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public StoryBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public StoryBuilder withStoryType(StoryType storyType) {
    this.storyType = storyType;
    return this;
  }

  public StoryBuilder withCurrentState(CurrentState currentState) {
    this.currentState = currentState;
    return this;
  }

  public StoryBuilder withEstimate(BigDecimal estimate) {
    this.estimate = estimate;
    return this;
  }

  public StoryBuilder withAcceptedAt(DateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  public StoryBuilder withDeadline(DateTime deadline) {
    this.deadline = deadline;
    return this;
  }

  public StoryBuilder withRequestedById(Integer requestedById) {
    this.requestedById = requestedById;
    return this;
  }

  public StoryBuilder withOwnerIds(List<Integer> ownerIds) {
    this.ownerIds = ownerIds;
    return this;
  }

  public StoryBuilder withTaskIds(List<Integer> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public StoryBuilder withFollowerIds(List<Integer> followerIds) {
    this.followerIds = followerIds;
    return this;
  }

  public StoryBuilder withCommentIds(List<Integer> commentIds) {
    this.commentIds = commentIds;
    return this;
  }

  public StoryBuilder withIntegrationId(Integer integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public StoryBuilder withExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public StoryBuilder withUrl(String url) {
    this.url = url;
    return this;
  }

  public StoryBuilder withLabelIds(List<Integer> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  public Story createStory() {
    return new Story(projectId,
        name,
        description,
        storyType,
        currentState,
        estimate,
        acceptedAt,
        deadline,
        requestedById,
        ownerIds,
        taskIds,
        followerIds,
        commentIds,
        labelIds,
        integrationId,
        externalId,
        url);
  }
}