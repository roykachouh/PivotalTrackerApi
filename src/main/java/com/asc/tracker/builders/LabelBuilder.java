package com.asc.tracker.builders;

import com.asc.tracker.model.Label;

public class LabelBuilder {
	private Integer projectId;
	private String name;

	public LabelBuilder withProjectId(Integer projectId) {
		this.projectId = projectId;
		return this;
	}

	public LabelBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public Label createLabel() {
		return new Label(projectId, name);
	}
}