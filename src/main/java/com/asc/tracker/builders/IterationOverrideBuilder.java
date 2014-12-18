package com.asc.tracker.builders;

import com.asc.tracker.model.IterationOverride;

public class IterationOverrideBuilder {

  private Integer number;

  private Integer projectId;

  private Integer length;

  private String teamStrength;

  public IterationOverrideBuilder withNumber(Integer number) {
    this.number = number;
    return this;
  }

  public IterationOverrideBuilder withProjectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  public IterationOverrideBuilder withLength(Integer length) {
    this.length = length;
    return this;
  }

  public IterationOverrideBuilder withTeamStrength(String teamStrength) {
    this.teamStrength = teamStrength;
    return this;
  }

  public IterationOverride createIterationOverride() {
    return new IterationOverride(number, projectId, length, teamStrength);
  }
}