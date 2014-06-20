package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class IterationOverride extends ModelBase {
	Integer number;
	Integer projectId;
	Integer length;
	Float teamStrength;

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

	public Float getTeamStrength() {
		return teamStrength;
	}

	public void setTeamStrength(Float teamStrength) {
		this.teamStrength = teamStrength;
	}
}
