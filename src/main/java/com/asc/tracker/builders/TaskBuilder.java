package com.asc.tracker.builders;

import com.asc.tracker.model.Task;

public class TaskBuilder {

  private Integer storyId;

  private String description;

  private Boolean complete;

  private Integer position;

  public TaskBuilder withStoryId(Integer storyId) {
    this.storyId = storyId;
    return this;
  }

  public TaskBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public TaskBuilder withComplete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  public TaskBuilder withPosition(Integer position) {
    this.position = position;
    return this;
  }

  public Task createTask() {
    return new Task(storyId, description, complete, position);
  }
}