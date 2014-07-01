package com.asc.tracker.model;

import com.asc.tracker.builders.EpicBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class EpicTest {
	public static final int PROJECT_ID = 1;
	public static final String NAME = "name";
	public static final int LABEL_ID = 1;
	public static final String DESCRIPTION = "description";
	public static final int AFTER_ID = 1;
	public static final int BEFORE_ID = 1;
	public static final String URL = "url";
	Epic epic;

	Integer[] commentIds = {1,2,3};

	@Before
	public void setup() {
		epic = new EpicBuilder()
				.withProjectId(PROJECT_ID)
				.withName(NAME)
				.withLabelId(LABEL_ID)
				.withDescription(DESCRIPTION)
				.withCommentIds(Arrays.asList(commentIds))
				.withAfterId(AFTER_ID)
				.withBeforeId(BEFORE_ID)
				.withUrl(URL)
				.createEpic();
	}

	@Test
	public void testStoryToJson() throws IOException {
		String epicJson = epic.toJson();

		assertThat(epicJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(epicJson, new TypeReference<HashMap<String, Object>>() {
				});

		assertThat(result.get("project_id")).isEqualTo(PROJECT_ID);
		assertThat(result.get("name")).isEqualTo(NAME);
		assertThat(result.get("label_id")).isEqualTo(LABEL_ID);
		assertThat(result.get("description")).isEqualTo(DESCRIPTION);
		assertThat(result.get("comment_ids")).isEqualTo(Arrays.asList(commentIds));
		assertThat(result.get("after_id")).isEqualTo(AFTER_ID);
		assertThat(result.get("before_id")).isEqualTo(BEFORE_ID);
		assertThat(result.get("url")).isEqualTo(URL);
	}
}