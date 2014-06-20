
package com.asc.tracker.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.util.List;
import java.util.TimeZone;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project extends ModelBase {
	String name;
	Integer version;
	Integer iterationLength;
	WeekStartDay weekStartDay;
	String pointScale;
	Boolean pointScaleIsCustom;
	Boolean bugsAndChoresAreEstimatable;
	Boolean automaticPlanning;
	Boolean enableTasks;
	DateTime startDate;
	TimeZone timeZone;
	Integer velocityAveragedOver;
	DateTime shownIterationsStartTime;
	DateTime startTime;
	Integer numberOfDoneIterationsToShow;
	Boolean hasGoogleDomain;
	String description;
	String profileContent;
	Boolean enableIncomingEmails;
	Integer initialVelocity;

	@JsonProperty("public")
	Boolean projectPublic;
	Boolean atomEnabled;
	Integer currentIterationNumber;
	Integer currentVelocity;
	Integer accountId;
	List<Integer> storyIds;
	List<Integer> epicIds;
	List<Integer> membershipIds;
	List<Integer> labelIds;
	List<Integer> integrationIds;
	List<Integer> iterationOverrideNumbers;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getIterationLength() {
		return iterationLength;
	}

	public void setIterationLength(Integer iterationLength) {
		this.iterationLength = iterationLength;
	}

	public WeekStartDay getWeekStartDay() {
		return weekStartDay;
	}

	public void setWeekStartDay(WeekStartDay weekStartDay) {
		this.weekStartDay = weekStartDay;
	}

	public String getPointScale() {
		return pointScale;
	}

	public void setPointScale(String pointScale) {
		this.pointScale = pointScale;
	}

	public Boolean getPointScaleIsCustom() {
		return pointScaleIsCustom;
	}

	public void setPointScaleIsCustom(Boolean pointScaleIsCustom) {
		this.pointScaleIsCustom = pointScaleIsCustom;
	}

	public Boolean getBugsAndChoresAreEstimatable() {
		return bugsAndChoresAreEstimatable;
	}

	public void setBugsAndChoresAreEstimatable(Boolean bugsAndChoresAreEstimatable) {
		this.bugsAndChoresAreEstimatable = bugsAndChoresAreEstimatable;
	}

	public Boolean getAutomaticPlanning() {
		return automaticPlanning;
	}

	public void setAutomaticPlanning(Boolean automaticPlanning) {
		this.automaticPlanning = automaticPlanning;
	}

	public Boolean getEnableTasks() {
		return enableTasks;
	}

	public void setEnableTasks(Boolean enableTasks) {
		this.enableTasks = enableTasks;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Integer getVelocityAveragedOver() {
		return velocityAveragedOver;
	}

	public void setVelocityAveragedOver(Integer velocityAveragedOver) {
		this.velocityAveragedOver = velocityAveragedOver;
	}

	public DateTime getShownIterationsStartTime() {
		return shownIterationsStartTime;
	}

	public void setShownIterationsStartTime(DateTime shownIterationsStartTime) {
		this.shownIterationsStartTime = shownIterationsStartTime;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public Integer getNumberOfDoneIterationsToShow() {
		return numberOfDoneIterationsToShow;
	}

	public void setNumberOfDoneIterationsToShow(Integer numberOfDoneIterationsToShow) {
		this.numberOfDoneIterationsToShow = numberOfDoneIterationsToShow;
	}

	public Boolean getHasGoogleDomain() {
		return hasGoogleDomain;
	}

	public void setHasGoogleDomain(Boolean hasGoogleDomain) {
		this.hasGoogleDomain = hasGoogleDomain;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfileContent() {
		return profileContent;
	}

	public void setProfileContent(String profileContent) {
		this.profileContent = profileContent;
	}

	public Boolean getEnableIncomingEmails() {
		return enableIncomingEmails;
	}

	public void setEnableIncomingEmails(Boolean enableIncomingEmails) {
		this.enableIncomingEmails = enableIncomingEmails;
	}

	public Integer getInitialVelocity() {
		return initialVelocity;
	}

	public void setInitialVelocity(Integer initialVelocity) {
		this.initialVelocity = initialVelocity;
	}

	public Boolean getProjectPublic() {
		return projectPublic;
	}

	public void setProjectPublic(Boolean projectPublic) {
		this.projectPublic = projectPublic;
	}

	public Boolean getAtomEnabled() {
		return atomEnabled;
	}

	public void setAtomEnabled(Boolean atomEnabled) {
		this.atomEnabled = atomEnabled;
	}

	public Integer getCurrentIterationNumber() {
		return currentIterationNumber;
	}

	public void setCurrentIterationNumber(Integer currentIterationNumber) {
		this.currentIterationNumber = currentIterationNumber;
	}

	public Integer getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(Integer currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public List<Integer> getStoryIds() {
		return storyIds;
	}

	public void setStoryIds(List<Integer> storyIds) {
		this.storyIds = storyIds;
	}

	public List<Integer> getEpicIds() {
		return epicIds;
	}

	public void setEpicIds(List<Integer> epicIds) {
		this.epicIds = epicIds;
	}

	public List<Integer> getMembershipIds() {
		return membershipIds;
	}

	public void setMembershipIds(List<Integer> membershipIds) {
		this.membershipIds = membershipIds;
	}

	public List<Integer> getLabelIds() {
		return labelIds;
	}

	public void setLabelIds(List<Integer> labelIds) {
		this.labelIds = labelIds;
	}

	public List<Integer> getIntegrationIds() {
		return integrationIds;
	}

	public void setIntegrationIds(List<Integer> integrationIds) {
		this.integrationIds = integrationIds;
	}

	public List<Integer> getIterationOverrideNumbers() {
		return iterationOverrideNumbers;
	}

	public void setIterationOverrideNumbers(List<Integer> iterationOverrideNumbers) {
		this.iterationOverrideNumbers = iterationOverrideNumbers;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
