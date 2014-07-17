package com.asc.tracker.api;

import com.asc.tracker.api.impl.ProjectTemplate;
import org.junit.Before;
import org.springframework.test.web.client.MockRestServiceServer;

/**
 * Created by kachouh on 7/16/14.
 */
public class AbstractApiTemplateTest {
	protected MockRestServiceServer mockServer;

	protected ProjectTemplate projectTemplate;

	@Before
	public void setup() {
		projectTemplate = new ProjectTemplate();
		mockServer = MockRestServiceServer.createServer(projectTemplate.getRestTemplate());
	}
}
