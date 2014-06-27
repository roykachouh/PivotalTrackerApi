package com.asc.tracker.model;

import com.asc.tracker.builders.AccountBuilder;
import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class AccountTest {

	public static final String PLAN = "plan";
	public static final String TEST_ACCOUNT = "Account";
	public static final AccountStatus ACTIVE = AccountStatus.active;
	public static final DateTime NOW = DateTime.now();
	public static final int DAYS_LEFT = 1;
	public static final boolean OVER_THE_LIMIT = false;
	public static final Integer[] PROJECT_IDS = new Integer[]{1, 2, 3};
	Account account;

	@Before
	public void setup() {

		account = new AccountBuilder()
				.withName(TEST_ACCOUNT)
				.withPlan(PLAN)
				.withStatus(ACTIVE)
				.withCreatedAt(NOW)
				.withUpdatedAt(NOW)
				.withDaysLeft(DAYS_LEFT)
				.withOverTheLimit(OVER_THE_LIMIT)
				.withProjectIds(Arrays.asList(PROJECT_IDS))
				.createAccount();
	}

	@Test
	public void testAccountToJson() throws IOException {
		String accountJson = account.toJson();

		assertThat(accountJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(accountJson, new TypeReference<HashMap<String, Object>>() {});

		assertThat(result.get("name")).isEqualTo(TEST_ACCOUNT);
		assertThat(result.get("plan")).isEqualTo(PLAN);
		assertThat(result.get("status")).isEqualTo(ACTIVE.toString());
		assertThat(result.get("days_left")).isEqualTo(DAYS_LEFT);
		assertThat(result.get("over_the_limit")).isEqualTo(OVER_THE_LIMIT);
		assertThat(result.get("created_at")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
		assertThat(result.get("updated_at")).isEqualTo(NOW.toString(CustomDateSerializer.formatter));
		assertThat(result.get("project_ids")).isEqualTo(Arrays.asList(PROJECT_IDS));
	}

}