package com.asc.tracker.model;

import javax.validation.constraints.NotNull;

/**
 * Created by kachouh on 6/20/14.
 */
public class Label extends ModelBase {
	Integer projectId;

	@NotNull
	String name;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
