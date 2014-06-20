package com.asc.tracker.model;

import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by kachouh on 6/20/14.
 */
public class Iteration extends ModelBase {
	Integer number;
	Integer projectId;
	Integer length;
	Float teamStrength;
	List<Integer> storyIds;
	DateTime start;
	DateTime finish;

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

	public List<Integer> getStoryIds() {
		return storyIds;
	}

	public void setStoryIds(List<Integer> storyIds) {
		this.storyIds = storyIds;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getFinish() {
		return finish;
	}

	public void setFinish(DateTime finish) {
		this.finish = finish;
	}
}
