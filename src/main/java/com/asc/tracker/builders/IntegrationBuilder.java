package com.asc.tracker.builders;

import com.asc.tracker.model.Integration;
import com.asc.tracker.model.IntegrationType;

public class IntegrationBuilder {
	private IntegrationType type;
	private String apiUsername;
	private String apiPassword;
	private String zendeskUserEmail;
	private String zendeskUserPassword;
	private String viewId;
	private String company;
	private String product;
	private String component;
	private String statusesToExclude;
	private String filterId;
	private String account;
	private String externalApiToken;
	private Integer binId;
	private Integer externalProjectId;
	private String importApiUrl;
	private String basicAuthUsername;
	private String basicAuthPassword;
	private Boolean commentsPrivate;
	private Boolean updateComments;
	private Boolean updateState;
	private Integer projectId;
	private Boolean canImport;
	private String baseUrl;
	private Boolean isOther;
	private String storyName;
	private String name;
	private Boolean active;

	public IntegrationBuilder withType(IntegrationType type) {
		this.type = type;
		return this;
	}

	public IntegrationBuilder withApiUsername(String apiUsername) {
		this.apiUsername = apiUsername;
		return this;
	}

	public IntegrationBuilder withApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
		return this;
	}

	public IntegrationBuilder withZendeskUserEmail(String zendeskUserEmail) {
		this.zendeskUserEmail = zendeskUserEmail;
		return this;
	}

	public IntegrationBuilder withZendeskUserPassword(String zendeskUserPassword) {
		this.zendeskUserPassword = zendeskUserPassword;
		return this;
	}

	public IntegrationBuilder withViewId(String viewId) {
		this.viewId = viewId;
		return this;
	}

	public IntegrationBuilder withCompany(String company) {
		this.company = company;
		return this;
	}

	public IntegrationBuilder withProduct(String product) {
		this.product = product;
		return this;
	}

	public IntegrationBuilder withComponent(String component) {
		this.component = component;
		return this;
	}

	public IntegrationBuilder withStatusesToExclude(String statusesToExclude) {
		this.statusesToExclude = statusesToExclude;
		return this;
	}

	public IntegrationBuilder withFilterId(String filterId) {
		this.filterId = filterId;
		return this;
	}

	public IntegrationBuilder withAccount(String account) {
		this.account = account;
		return this;
	}

	public IntegrationBuilder withExternalApiToken(String externalApiToken) {
		this.externalApiToken = externalApiToken;
		return this;
	}

	public IntegrationBuilder withBinId(Integer binId) {
		this.binId = binId;
		return this;
	}

	public IntegrationBuilder withExternalProjectId(Integer externalProjectId) {
		this.externalProjectId = externalProjectId;
		return this;
	}

	public IntegrationBuilder withImportApiUrl(String importApiUrl) {
		this.importApiUrl = importApiUrl;
		return this;
	}

	public IntegrationBuilder withBasicAuthUsername(String basicAuthUsername) {
		this.basicAuthUsername = basicAuthUsername;
		return this;
	}

	public IntegrationBuilder withBasicAuthPassword(String basicAuthPassword) {
		this.basicAuthPassword = basicAuthPassword;
		return this;
	}

	public IntegrationBuilder withCommentsPrivate(Boolean commentsPrivate) {
		this.commentsPrivate = commentsPrivate;
		return this;
	}

	public IntegrationBuilder withUpdateComments(Boolean updateComments) {
		this.updateComments = updateComments;
		return this;
	}

	public IntegrationBuilder withUpdateState(Boolean updateState) {
		this.updateState = updateState;
		return this;
	}

	public IntegrationBuilder withProjectId(Integer projectId) {
		this.projectId = projectId;
		return this;
	}

	public IntegrationBuilder withCanImport(Boolean canImport) {
		this.canImport = canImport;
		return this;
	}

	public IntegrationBuilder withBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
		return this;
	}

	public IntegrationBuilder withIsOther(Boolean isOther) {
		this.isOther = isOther;
		return this;
	}

	public IntegrationBuilder withStoryName(String storyName) {
		this.storyName = storyName;
		return this;
	}

	public IntegrationBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public IntegrationBuilder withActive(Boolean active) {
		this.active = active;
		return this;
	}

	public Integration createIntegration() {
		return new Integration(type, apiUsername, apiPassword, zendeskUserEmail, zendeskUserPassword, viewId, company, product, component, statusesToExclude, filterId, account, externalApiToken, binId, externalProjectId, importApiUrl, basicAuthUsername, basicAuthPassword, commentsPrivate, updateComments, updateState, projectId, canImport, baseUrl, isOther, storyName, name, active);
	}
}