package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class Task extends ModelBase {

  Integer storyId;

  String description;

  Boolean complete;

  Integer position;

  public Task(Integer storyId, String description, Boolean complete, Integer position) {
    this.storyId = storyId;
    this.description = description;
    this.complete = complete;
    this.position = position;
  }

  public Integer getStoryId() {
    return storyId;
  }

  public void setStoryId(Integer storyId) {
    this.storyId = storyId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }
}
