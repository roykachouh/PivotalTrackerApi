package com.asc.tracker.model;

import com.asc.tracker.builders.ProjectBuilder;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.fest.assertions.Assertions.assertThat;

public class ProjectTest {

	public static final String NAME = "name";
	public static final int VERSION = 1;
	public static final int ITERATION_LENGTH = 1;
	public static final WeekStartDay MONDAY = WeekStartDay.Monday;
	public static final String POINT_SCALE = "0,1,2,3,5,8";
	public static final boolean POINT_SCALE_IS_CUSTOM = false;
	public static final boolean BUGS_AND_CHORES_ARE_ESTIMATABLE = false;
	public static final boolean AUTOMATIC_PLANNING = false;
	public static final boolean ENABLE_TASKS = true;
	public static final DateTime NOW = DateTime.now();
	public static final int VELOCITY_AVERAGED_OVER = 1;
	public static final int NUMBER_OF_DONE_ITERATIONS_TO_SHOW = 1;
	public static final boolean HAS_GOOGLE_DOMAIN = false;
	public static final String DESCRIPTION = "description";
	public static final String PROFILE_CONTENT = "profile content";
	public static final boolean ENABLE_INCOMING_EMAILS = true;
	public static final int INITIAL_VELOCITY = 1;
	public static final boolean PROJECT_PUBLIC = true;
	public static final boolean ATOM_ENABLED = false;
	public static final int CURRENT_ITERATION_NUMBER = 1;
	public static final int CURRENT_VELOCITY = 1;
	public static final int ACCOUNT_ID = 1;
	public static final Integer[] STORY_IDS = {1, 2, 3};
	public static final Integer[] EPIC_IDS = {1, 2, 3};
	public static final Integer[] MEMBERSHIP_IDS = {1, 2, 3};
	public static final Integer[] LABEL_IDS = {1, 2, 3};
	public static final Integer[] INTEGRATION_IDS = {1, 2, 3};
	public static final Integer[] ITERATION_OVERRIDE_NUMBERS = {1, 2, 3};

	Project project;

	@Before
	public void setup() {

		project = new ProjectBuilder()
				.withName(NAME)
				.withVersion(VERSION)
				.withIterationLength(ITERATION_LENGTH)
				.withWeekStartDay(MONDAY)
				.withPointScale(POINT_SCALE)
				.withPointScaleIsCustom(POINT_SCALE_IS_CUSTOM)
				.withBugsAndChoresAreEstimatable(BUGS_AND_CHORES_ARE_ESTIMATABLE)
				.withAutomaticPlanning(AUTOMATIC_PLANNING)
				.withEnableTasks(ENABLE_TASKS)
				.withStartDate(NOW)
				.withVelocityAveragedOver(VELOCITY_AVERAGED_OVER)
				.withShownIterationsStartTime(NOW)
				.withStartTime(NOW)
				.withNumberOfDoneIterationsToShow(NUMBER_OF_DONE_ITERATIONS_TO_SHOW)
				.withHasGoogleDomain(HAS_GOOGLE_DOMAIN)
				.withDescription(DESCRIPTION)
				.withProfileContent(PROFILE_CONTENT)
				.withEnableIncomingEmails(ENABLE_INCOMING_EMAILS)
				.withInitialVelocity(INITIAL_VELOCITY)
				.withProjectPublic(PROJECT_PUBLIC)
				.withAtomEnabled(ATOM_ENABLED)
				.withCurrentIterationNumber(CURRENT_ITERATION_NUMBER)
				.withCurrentVelocity(CURRENT_VELOCITY)
				.withAccountId(ACCOUNT_ID)
				.withStoryIds(Arrays.asList(STORY_IDS))
				.withEpicIds(Arrays.asList(EPIC_IDS))
				.withMembershipIds(Arrays.asList(MEMBERSHIP_IDS))
				.withLabelIds(Arrays.asList(LABEL_IDS))
				.withIntegrationIds(Arrays.asList(INTEGRATION_IDS))
				.withIterationOverrideNumbers(Arrays.asList(ITERATION_OVERRIDE_NUMBERS))
				.withCreatedAt(NOW)
				.withUpdatedAt(NOW)
				.createProject();
	}

	@Test
	public void testProjectToJson() throws IOException {
		String accountJson = project.toJson();

		assertThat(accountJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(accountJson, new TypeReference<HashMap<String, Object>>() {});

		assertThat(result.get("name")).isEqualTo(NAME);
		assertThat(result.get("version")).isEqualTo(VERSION);
		assertThat(result.get("iteration_length")).isEqualTo(ITERATION_LENGTH);
		assertThat(result.get("week_start_day")).isEqualTo(MONDAY.toString());
		assertThat(result.get("point_scale")).isEqualTo(POINT_SCALE);
		assertThat(result.get("point_scale_is_custom")).isEqualTo(POINT_SCALE_IS_CUSTOM);
		assertThat(result.get("bugs_and_chores_are_estimatable")).isEqualTo(BUGS_AND_CHORES_ARE_ESTIMATABLE);
		assertThat(result.get("automatic_planning")).isEqualTo(AUTOMATIC_PLANNING);
		assertThat(result.get("enable_tasks")).isEqualTo(ENABLE_TASKS);
		assertThat(result.get("start_date")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
		assertThat(result.get("velocity_averaged_over")).isEqualTo(VELOCITY_AVERAGED_OVER);
		assertThat(result.get("shown_iterations_start_time")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
		assertThat(result.get("start_time")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
		assertThat(result.get("number_of_done_iterations_to_show")).isEqualTo(NUMBER_OF_DONE_ITERATIONS_TO_SHOW);
		assertThat(result.get("has_google_domain")).isEqualTo(HAS_GOOGLE_DOMAIN);
		assertThat(result.get("description")).isEqualTo(DESCRIPTION);
		assertThat(result.get("profile_content")).isEqualTo(PROFILE_CONTENT);
		assertThat(result.get("enable_incoming_emails")).isEqualTo(ENABLE_INCOMING_EMAILS);
		assertThat(result.get("initial_velocity")).isEqualTo(INITIAL_VELOCITY);
		assertThat(result.get("public")).isEqualTo(PROJECT_PUBLIC);
		assertThat(result.get("atom_enabled")).isEqualTo(ATOM_ENABLED);
		assertThat(result.get("current_iteration_number")).isEqualTo(CURRENT_ITERATION_NUMBER);
		assertThat(result.get("current_velocity")).isEqualTo(CURRENT_VELOCITY);
		assertThat(result.get("account_id")).isEqualTo(ACCOUNT_ID);
		assertThat(result.get("story_ids")).isEqualTo(Arrays.asList(STORY_IDS));
		assertThat(result.get("epic_ids")).isEqualTo(Arrays.asList(EPIC_IDS));
		assertThat(result.get("membership_ids")).isEqualTo(Arrays.asList(MEMBERSHIP_IDS));
		assertThat(result.get("label_ids")).isEqualTo(Arrays.asList(LABEL_IDS));
		assertThat(result.get("integration_ids")).isEqualTo(Arrays.asList(INTEGRATION_IDS));
		assertThat(result.get("iteration_override_numbers")).isEqualTo(Arrays.asList(ITERATION_OVERRIDE_NUMBERS));
	}

}