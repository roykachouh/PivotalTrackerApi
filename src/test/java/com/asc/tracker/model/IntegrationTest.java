package com.asc.tracker.model;

import com.asc.tracker.builders.IntegrationBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

public class IntegrationTest {


	public static final IntegrationType BUGZILLA = IntegrationType.bugzilla;
	public static final String API_USERNAME = "api_username";
	public static final String API_PASSWORD = "api_password";
	public static final String ZENDESK_USER_EMAIL = "zendesk_user_email";
	public static final String ZENDESK_USER_PASSWORD = "zendesk_user_password";
	public static final String VIEW_ID = "view_id";
	public static final String COMPANY = "company";
	public static final String PRODUCT = "product";
	public static final String COMPOENENT = "compoenent";
	public static final String PRODUCT1 = "product";
	public static final String STATUES_TO_EXCLUDE = "statues_to_exclude";
	public static final String FILTER_ID = "filter_id";
	public static final String ACCOUNT = "account";
	public static final String EXTERNAL_API_TOKEN = "external_api_token";
	public static final int BIN_ID = 1;
	public static final int EXTERNAL_PROJECT_ID = 1;
	public static final String IMPORT_API_URL = "import_api_url";
	public static final String BASIC_AUTH_USERNAME = "basic_auth_username";
	public static final String BASIC_AUTH_PASSWORD = "basic_auth_password";
	public static final boolean COMMENTS_PRIVATE = false;
	public static final boolean UPDATE_COMMENTS = false;
	public static final boolean UPDATE_STATE = false;
	public static final int PROJECT_ID = 1;
	public static final boolean CAN_IMPORT = false;
	public static final String BASE_URL = "base url";
	public static final boolean IS_OTHER = false;
	public static final String STORY_NAME = "story_name";
	public static final String NAME = "name";
	public static final boolean ACTIVE = true;
	Integration integration;

	@Before
	public void setup() {

		integration = new IntegrationBuilder()
				.withType(BUGZILLA)
				.withApiUsername(API_USERNAME)
				.withApiPassword(API_PASSWORD)
				.withZendeskUserEmail(ZENDESK_USER_EMAIL)
				.withZendeskUserPassword(ZENDESK_USER_PASSWORD)
				.withViewId(VIEW_ID)
				.withCompany(COMPANY)
				.withProduct(PRODUCT)
				.withComponent(COMPOENENT)
				.withProduct(PRODUCT1)
				.withStatusesToExclude(STATUES_TO_EXCLUDE)
				.withFilterId(FILTER_ID)
				.withAccount(ACCOUNT)
				.withExternalApiToken(EXTERNAL_API_TOKEN)
				.withBinId(BIN_ID)
				.withExternalProjectId(EXTERNAL_PROJECT_ID)
				.withImportApiUrl(IMPORT_API_URL)
				.withBasicAuthUsername(BASIC_AUTH_USERNAME)
				.withBasicAuthPassword(BASIC_AUTH_PASSWORD)
				.withCommentsPrivate(COMMENTS_PRIVATE)
				.withUpdateComments(UPDATE_COMMENTS)
				.withUpdateState(UPDATE_STATE)
				.withProjectId(PROJECT_ID)
				.withCanImport(CAN_IMPORT)
				.withBaseUrl(BASE_URL)
				.withIsOther(IS_OTHER)
				.withStoryName(STORY_NAME)
				.withName(NAME)
				.withActive(ACTIVE)
				.createIntegration();
	}

	@Test
	public void testPersonToJson() throws IOException {
		String integrationJson = integration.toJson();

		assertThat(integrationJson).isNotNull();

		Map<String, Object> result =
				new ObjectMapper().readValue(integrationJson, new TypeReference<HashMap<String, Object>>() {});

		assertThat(result.get("type")).isEqualTo(BUGZILLA.toString());
		assertThat(result.get("api_username")).isEqualTo(API_USERNAME);
		assertThat(result.get("api_password")).isEqualTo(API_PASSWORD);
		assertThat(result.get("company")).isEqualTo(COMPANY);
	}

}