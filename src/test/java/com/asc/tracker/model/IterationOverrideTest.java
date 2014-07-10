package com.asc.tracker.model;

import com.asc.tracker.builders.IterationOverrideBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class IterationOverrideTest {

	public static final int NUMBER = 1;
	public static final int PROJECT_ID = 1;
	public static final int LENGTH = 1;
	public static final String TEAM_STRENGTH = "1.0";
	IterationOverride iterationOverride;

	@Before
	public void setup() {
		iterationOverride = new IterationOverrideBuilder()
				.withNumber(NUMBER)
				.withProjectId(PROJECT_ID)
				.withLength(LENGTH)
				.withTeamStrength(TEAM_STRENGTH)
				.createIterationOverride();
	}


	@Test
	public void testPersonToJson() throws IOException {
		String iterationOverrideJSON = iterationOverride.toJson();

		assertThat(iterationOverrideJSON).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(iterationOverrideJSON, new TypeReference<HashMap<String, Object>>() {});

		assertThat(result.get("number")).isEqualTo(NUMBER);
		assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
		assertThat(result.get("length")).isEqualTo(LENGTH);
		assertThat(result.get("team_strength")).isEqualTo(TEAM_STRENGTH);
	}

}