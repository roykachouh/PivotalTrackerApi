package com.asc.tracker.builders;

import com.asc.tracker.model.Iteration;
import org.joda.time.DateTime;

import java.util.List;

public class IterationBuilder {
	private Integer number;
	private Integer projectId;
	private Integer length;
	private String teamStrength;
	private List<Integer> storyIds;
	private DateTime start;
	private DateTime finish;

	public IterationBuilder withNumber(Integer number) {
		this.number = number;
		return this;
	}

	public IterationBuilder withProjectId(Integer projectId) {
		this.projectId = projectId;
		return this;
	}

	public IterationBuilder withLength(Integer length) {
		this.length = length;
		return this;
	}

	public IterationBuilder withTeamStrength(String teamStrength) {
		this.teamStrength = teamStrength;
		return this;
	}

	public IterationBuilder withStoryIds(List<Integer> storyIds) {
		this.storyIds = storyIds;
		return this;
	}

	public IterationBuilder withStart(DateTime start) {
		this.start = start;
		return this;
	}

	public IterationBuilder withFinish(DateTime finish) {
		this.finish = finish;
		return this;
	}

	public Iteration createIteration() {
		return new Iteration(number, projectId, length, teamStrength, storyIds, start, finish);
	}
}