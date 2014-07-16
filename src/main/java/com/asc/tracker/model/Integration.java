package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class Integration extends ModelBase {

	IntegrationType type;

	String apiUsername;
	String apiPassword;
	String zendeskUserEmail;
	String zendeskUserPassword;
	String viewId;
	String company;
	String product;
	String component;
	String statusesToExclude;
	String filterId;
	String account;
	String externalApiToken;
	Integer binId;
	Integer externalProjectId;
	String importApiUrl;
	String basicAuthUsername;
	String basicAuthPassword;
	Boolean commentsPrivate;
	Boolean updateComments;
	Boolean updateState;
	Integer projectId;
	Boolean canImport;
	String baseUrl;
	Boolean isOther;
	String storyName;
	String name;
	Boolean active;


	public Integration(IntegrationType type, String apiUsername, String apiPassword, String zendeskUserEmail, String zendeskUserPassword, String viewId, String company, String product, String component, String statusesToExclude, String filterId, String account, String externalApiToken, Integer binId, Integer externalProjectId, String importApiUrl, String basicAuthUsername, String basicAuthPassword, Boolean commentsPrivate, Boolean updateComments, Boolean updateState, Integer projectId, Boolean canImport, String baseUrl, Boolean isOther, String storyName, String name, Boolean active) {
		this.type = type;
		this.apiUsername = apiUsername;
		this.apiPassword = apiPassword;
		this.zendeskUserEmail = zendeskUserEmail;
		this.zendeskUserPassword = zendeskUserPassword;
		this.viewId = viewId;
		this.company = company;
		this.product = product;
		this.component = component;
		this.statusesToExclude = statusesToExclude;
		this.filterId = filterId;
		this.account = account;
		this.externalApiToken = externalApiToken;
		this.binId = binId;
		this.externalProjectId = externalProjectId;
		this.importApiUrl = importApiUrl;
		this.basicAuthUsername = basicAuthUsername;
		this.basicAuthPassword = basicAuthPassword;
		this.commentsPrivate = commentsPrivate;
		this.updateComments = updateComments;
		this.updateState = updateState;
		this.projectId = projectId;
		this.canImport = canImport;
		this.baseUrl = baseUrl;
		this.isOther = isOther;
		this.storyName = storyName;
		this.name = name;
		this.active = active;
	}

	public IntegrationType getType() {
		return type;
	}

	public void setType(IntegrationType type) {
		this.type = type;
	}

	public String getApiUsername() {
		return apiUsername;
	}

	public void setApiUsername(String apiUsername) {
		this.apiUsername = apiUsername;
	}

	public String getApiPassword() {
		return apiPassword;
	}

	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}

	public String getZendeskUserEmail() {
		return zendeskUserEmail;
	}

	public void setZendeskUserEmail(String zendeskUserEmail) {
		this.zendeskUserEmail = zendeskUserEmail;
	}

	public String getZendeskUserPassword() {
		return zendeskUserPassword;
	}

	public void setZendeskUserPassword(String zendeskUserPassword) {
		this.zendeskUserPassword = zendeskUserPassword;
	}

	public String getViewId() {
		return viewId;
	}

	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getStatusesToExclude() {
		return statusesToExclude;
	}

	public void setStatusesToExclude(String statusesToExclude) {
		this.statusesToExclude = statusesToExclude;
	}

	public String getFilterId() {
		return filterId;
	}

	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getExternalApiToken() {
		return externalApiToken;
	}

	public void setExternalApiToken(String externalApiToken) {
		this.externalApiToken = externalApiToken;
	}

	public Integer getBinId() {
		return binId;
	}

	public void setBinId(Integer binId) {
		this.binId = binId;
	}

	public Integer getExternalProjectId() {
		return externalProjectId;
	}

	public void setExternalProjectId(Integer externalProjectId) {
		this.externalProjectId = externalProjectId;
	}

	public String getImportApiUrl() {
		return importApiUrl;
	}

	public void setImportApiUrl(String importApiUrl) {
		this.importApiUrl = importApiUrl;
	}

	public String getBasicAuthUsername() {
		return basicAuthUsername;
	}

	public void setBasicAuthUsername(String basicAuthUsername) {
		this.basicAuthUsername = basicAuthUsername;
	}

	public String getBasicAuthPassword() {
		return basicAuthPassword;
	}

	public void setBasicAuthPassword(String basicAuthPassword) {
		this.basicAuthPassword = basicAuthPassword;
	}

	public Boolean getCommentsPrivate() {
		return commentsPrivate;
	}

	public void setCommentsPrivate(Boolean commentsPrivate) {
		this.commentsPrivate = commentsPrivate;
	}

	public Boolean getUpdateComments() {
		return updateComments;
	}

	public void setUpdateComments(Boolean updateComments) {
		this.updateComments = updateComments;
	}

	public Boolean getUpdateState() {
		return updateState;
	}

	public void setUpdateState(Boolean updateState) {
		this.updateState = updateState;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Boolean getCanImport() {
		return canImport;
	}

	public void setCanImport(Boolean canImport) {
		this.canImport = canImport;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Boolean getIsOther() {
		return isOther;
	}

	public void setIsOther(Boolean isOther) {
		this.isOther = isOther;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
