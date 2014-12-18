package com.asc.tracker.api;

import org.junit.Before;
import org.springframework.test.web.client.MockRestServiceServer;
import com.asc.tracker.api.impl.ProjectTemplate;

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
