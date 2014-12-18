package com.asc.tracker.model;

import java.util.List;

import org.joda.time.DateTime;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by kachouh on 6/20/14.
 */
public class Iteration extends ModelBase {

  Integer number;

  Integer projectId;

  Integer length;

  String teamStrength;

  List<Integer> storyIds;

  DateTime start;

  DateTime finish;

  public Iteration(Integer number,
      Integer projectId,
      Integer length,
      String teamStrength,
      List<Integer> storyIds,
      DateTime start,
      DateTime finish) {
    this.number = number;
    this.projectId = projectId;
    this.length = length;
    this.teamStrength = teamStrength;
    this.storyIds = storyIds;
    this.start = start;
    this.finish = finish;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public String getTeamStrength() {
    return teamStrength;
  }

  public void setTeamStrength(String teamStrength) {
    this.teamStrength = teamStrength;
  }

  public List<Integer> getStoryIds() {
    return storyIds;
  }

  public void setStoryIds(List<Integer> storyIds) {
    this.storyIds = storyIds;
  }

  @JsonSerialize(using = CustomDateSerializer.class)
  public DateTime getStart() {
    return start;
  }

  public void setStart(DateTime start) {
    this.start = start;
  }

  @JsonSerialize(using = CustomDateSerializer.class)
  public DateTime getFinish() {
    return finish;
  }

  public void setFinish(DateTime finish) {
    this.finish = finish;
  }
}
