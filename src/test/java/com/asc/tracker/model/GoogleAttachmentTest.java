package com.asc.tracker.model;

import com.asc.tracker.builders.GoogleAttachmentBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class GoogleAttachmentTest {
	public static final int COMMENT_ID = 1;
	public static final int PERSON_ID = 1;
	public static final String GOOGLE_KIND = "google_kind";
	public static final String TITLE = "title";
	public static final String GOOGLE_ID = "google_id";
	public static final String ALTERNATE_LINK = "alternate link";
	public static final String RESOURCE_ID = "resource id";
	GoogleAttachment googleAttachment;

	@Before
	public void setup() {
		googleAttachment = new GoogleAttachmentBuilder()
				.withCommentId(COMMENT_ID)
				.withPersonId(PERSON_ID)
				.withGoogleKind(GOOGLE_KIND)
				.withTitle(TITLE)
				.withGoogleId(GOOGLE_ID)
				.withAlternateLink(ALTERNATE_LINK)
				.withResourceId(RESOURCE_ID)
				.createGoogleAttachment();
	}

	@Test
	public void testStoryToJson() throws IOException {
		String googleAttachmentJson = googleAttachment.toJson();

		assertThat(googleAttachmentJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(googleAttachmentJson, new TypeReference<HashMap<String, Object>>() {
				});

		assertThat(result.get("comment_id")).isEqualTo(COMMENT_ID);
		assertThat(result.get("person_id")).isEqualTo(PERSON_ID);
		assertThat(result.get("google_kind")).isEqualTo(GOOGLE_KIND);
		assertThat(result.get("title")).isEqualTo(TITLE);
		assertThat(result.get("google_id")).isEqualTo(GOOGLE_ID);
		assertThat(result.get("alternate_link")).isEqualTo(ALTERNATE_LINK);
		assertThat(result.get("resource_id")).isEqualTo(RESOURCE_ID);
	}
}