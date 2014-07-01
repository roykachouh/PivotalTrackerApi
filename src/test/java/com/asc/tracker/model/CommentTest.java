package com.asc.tracker.model;

import com.asc.tracker.builders.CommentBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class CommentTest {


	public static final int STORY_ID = 1;
	public static final int EPIC_ID = 1;
	public static final String TEXT = "text";
	public static final int PERSON_ID = 1;
	public static final Integer[] FILE_ATTACHMENT_IDS = {1,2,3};
	public static final Integer[] GOOGLE_ATTACHMENT_IDS = {1,2,3};
	public static final String COMMENT_IDENTIFER = "comment identifer";
	public static final String COMMIT_TYPE = "commit type";

	Comment comment;

	@Before
	public void setup() {
		comment = new CommentBuilder()
				.withStoryId(STORY_ID)
				.withEpicId(EPIC_ID)
				.withText(TEXT)
				.withPersonId(PERSON_ID)
				.withFileAttachmentIds(Arrays.asList(FILE_ATTACHMENT_IDS))
				.withGoogleAttachmentIds(Arrays.asList(GOOGLE_ATTACHMENT_IDS))
				.withCommentIdentifier(COMMENT_IDENTIFER)
				.withCommitType(COMMIT_TYPE)
				.createComment();
	}

	@Test
	public void testStoryToJson() throws IOException {
		String commentJson = comment.toJson();

		assertThat(commentJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(commentJson, new TypeReference<HashMap<String, Object>>() {});

		assertThat(result.get("story_id")).isEqualTo(STORY_ID);
		assertThat(result.get("epic_id")).isEqualTo(EPIC_ID);
		assertThat(result.get("text")).isEqualTo(TEXT);
		assertThat(result.get("person_id")).isEqualTo(PERSON_ID);
		assertThat(result.get("file_attachment_ids")).isEqualTo(Arrays.asList(FILE_ATTACHMENT_IDS));
		assertThat(result.get("google_attachment_ids")).isEqualTo(Arrays.asList(GOOGLE_ATTACHMENT_IDS));
		assertThat(result.get("comment_identifier")).isEqualTo(COMMENT_IDENTIFER);
		assertThat(result.get("commit_type")).isEqualTo(COMMIT_TYPE);
	}

}