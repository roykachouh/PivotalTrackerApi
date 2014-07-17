package com.asc.tracker.api.impl;

import com.asc.tracker.api.AbstractApiTemplate;
import com.asc.tracker.api.ProjectOperations;
import com.asc.tracker.model.Project;
import org.springframework.http.ResponseEntity;

/**
 * Created by kachouh on 7/16/14.
 */
public class ProjectTemplate extends AbstractApiTemplate implements ProjectOperations {
	public final static String ENDPOINT_TEMPLATE = "/projects/{project_id}";

	@Override
	public Project getProject(String projectId) {

		ResponseEntity<Project> projectResponse =
				getRestTemplate().getForEntity(PIVOTAL_BASE_ENDPOINT + ENDPOINT_TEMPLATE, Project.class, projectId);

		return projectResponse.getBody();
	}

	@Override
	public Project updateProject(Project project) {
		getRestTemplate().put(PIVOTAL_BASE_ENDPOINT + ENDPOINT_TEMPLATE, project, project.getId());

		return project;
	}
}
