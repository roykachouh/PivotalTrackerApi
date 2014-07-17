package com.asc.tracker.api;

import com.asc.tracker.api.impl.ProjectTemplate;
import com.asc.tracker.model.Project;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ProjectTemplateTest extends AbstractApiTemplateTest {

	public static final String TEST_PROJECT_ID = "1120662";
	public static final String TEST_PROJECT = "Test";

	final String endpoint =
			AbstractApiTemplate.PIVOTAL_BASE_ENDPOINT
					+ ProjectTemplate.ENDPOINT_TEMPLATE;
	@Test
	public void testGetProject() throws Exception {
		ProjectTemplate pivotalProjectTemplate = new ProjectTemplate();

		Project project = pivotalProjectTemplate.getProject(TEST_PROJECT_ID);

		assertThat(project.getKind()).isEqualTo("project");
		assertThat(project.getIterationLength()).isEqualTo(1);
	}

	@Test
	public void testUpdateProject() throws Exception {
		ProjectTemplate pivotalProjectTemplate = new ProjectTemplate();

		Project project = pivotalProjectTemplate.getProject(TEST_PROJECT_ID);

		assertThat(project.getKind()).isEqualTo("project");

		project.setName("Updated Name");
		Project updatedProject = pivotalProjectTemplate.updateProject(project);

		assertThat(updatedProject).isNotNull();

		updatedProject = pivotalProjectTemplate.getProject(TEST_PROJECT_ID);

		assertThat(updatedProject.getName()).isEqualTo("Updated Name");
	}

}