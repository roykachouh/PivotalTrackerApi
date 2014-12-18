package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class IterationOverride extends ModelBase {

  Integer number;

  Integer projectId;

  Integer length;

  String teamStrength;

  public IterationOverride(Integer number, Integer projectId, Integer length, String teamStrength) {
    this.number = number;
    this.projectId = projectId;
    this.length = length;
    this.teamStrength = teamStrength;
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
}
