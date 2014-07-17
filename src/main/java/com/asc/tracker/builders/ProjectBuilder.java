package com.asc.tracker.builders;

import com.asc.tracker.model.Project;
import com.asc.tracker.model.TimeZone;
import com.asc.tracker.model.WeekStartDay;
import org.joda.time.DateTime;

import java.util.List;

public class ProjectBuilder {
	private String name;
	private Integer version;
	private Integer iterationLength;
	private WeekStartDay weekStartDay;
	private String pointScale;
	private Boolean pointScaleIsCustom;
	private Boolean bugsAndChoresAreEstimatable;
	private Boolean automaticPlanning;
	private Boolean enableTasks;
	private DateTime startDate;
	private TimeZone timeZone;
	private Integer velocityAveragedOver;
	private DateTime shownIterationsStartTime;
	private DateTime startTime;
	private Integer numberOfDoneIterationsToShow;
	private Boolean hasGoogleDomain;
	private String description;
	private String profileContent;
	private Boolean enableIncomingEmails;
	private Integer initialVelocity;
	private Boolean projectPublic;
	private Boolean atomEnabled;
	private Integer currentIterationNumber;
	private Integer currentVelocity;
	private Integer accountId;
	private List<Integer> storyIds;
	private List<Integer> epicIds;
	private List<Integer> membershipIds;
	private List<Integer> labelIds;
	private List<Integer> integrationIds;
	private List<Integer> iterationOverrideNumbers;
	private DateTime updatedAt;
	private DateTime createdAt;

	public ProjectBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public ProjectBuilder withVersion(Integer version) {
		this.version = version;
		return this;
	}

	public ProjectBuilder withIterationLength(Integer iterationLength) {
		this.iterationLength = iterationLength;
		return this;
	}

	public ProjectBuilder withWeekStartDay(WeekStartDay weekStartDay) {
		this.weekStartDay = weekStartDay;
		return this;
	}

	public ProjectBuilder withPointScale(String pointScale) {
		this.pointScale = pointScale;
		return this;
	}

	public ProjectBuilder withPointScaleIsCustom(Boolean pointScaleIsCustom) {
		this.pointScaleIsCustom = pointScaleIsCustom;
		return this;
	}

	public ProjectBuilder withBugsAndChoresAreEstimatable(Boolean bugsAndChoresAreEstimatable) {
		this.bugsAndChoresAreEstimatable = bugsAndChoresAreEstimatable;
		return this;
	}

	public ProjectBuilder withAutomaticPlanning(Boolean automaticPlanning) {
		this.automaticPlanning = automaticPlanning;
		return this;
	}

	public ProjectBuilder withEnableTasks(Boolean enableTasks) {
		this.enableTasks = enableTasks;
		return this;
	}

	public ProjectBuilder withStartDate(DateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	public ProjectBuilder withTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public ProjectBuilder withVelocityAveragedOver(Integer velocityAveragedOver) {
		this.velocityAveragedOver = velocityAveragedOver;
		return this;
	}

	public ProjectBuilder withShownIterationsStartTime(DateTime shownIterationsStartTime) {
		this.shownIterationsStartTime = shownIterationsStartTime;
		return this;
	}

	public ProjectBuilder withStartTime(DateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	public ProjectBuilder withNumberOfDoneIterationsToShow(Integer numberOfDoneIterationsToShow) {
		this.numberOfDoneIterationsToShow = numberOfDoneIterationsToShow;
		return this;
	}

	public ProjectBuilder withHasGoogleDomain(Boolean hasGoogleDomain) {
		this.hasGoogleDomain = hasGoogleDomain;
		return this;
	}

	public ProjectBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	public ProjectBuilder withProfileContent(String profileContent) {
		this.profileContent = profileContent;
		return this;
	}

	public ProjectBuilder withEnableIncomingEmails(Boolean enableIncomingEmails) {
		this.enableIncomingEmails = enableIncomingEmails;
		return this;
	}

	public ProjectBuilder withInitialVelocity(Integer initialVelocity) {
		this.initialVelocity = initialVelocity;
		return this;
	}

	public ProjectBuilder withProjectPublic(Boolean projectPublic) {
		this.projectPublic = projectPublic;
		return this;
	}

	public ProjectBuilder withAtomEnabled(Boolean atomEnabled) {
		this.atomEnabled = atomEnabled;
		return this;
	}

	public ProjectBuilder withCurrentIterationNumber(Integer currentIterationNumber) {
		this.currentIterationNumber = currentIterationNumber;
		return this;
	}

	public ProjectBuilder withCurrentVelocity(Integer currentVelocity) {
		this.currentVelocity = currentVelocity;
		return this;
	}

	public ProjectBuilder withAccountId(Integer accountId) {
		this.accountId = accountId;
		return this;
	}

	public ProjectBuilder withStoryIds(List<Integer> storyIds) {
		this.storyIds = storyIds;
		return this;
	}

	public ProjectBuilder withEpicIds(List<Integer> epicIds) {
		this.epicIds = epicIds;
		return this;
	}

	public ProjectBuilder withMembershipIds(List<Integer> membershipIds) {
		this.membershipIds = membershipIds;
		return this;
	}

	public ProjectBuilder withLabelIds(List<Integer> labelIds) {
		this.labelIds = labelIds;
		return this;
	}

	public ProjectBuilder withIntegrationIds(List<Integer> integrationIds) {
		this.integrationIds = integrationIds;
		return this;
	}

	public ProjectBuilder withIterationOverrideNumbers(List<Integer> iterationOverrideNumbers) {
		this.iterationOverrideNumbers = iterationOverrideNumbers;
		return this;
	}

	public ProjectBuilder withCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public ProjectBuilder withUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public Project createProject() {
		return new Project(name,
						   version,
						   iterationLength,
						   weekStartDay,
						   pointScale,
						   pointScaleIsCustom,
						   bugsAndChoresAreEstimatable,
						   automaticPlanning,
						   enableTasks,
						   startDate,
						   timeZone,
						   velocityAveragedOver,
						   shownIterationsStartTime,
						   startTime,
						   numberOfDoneIterationsToShow,
						   hasGoogleDomain,
						   description,
						   profileContent,
						   enableIncomingEmails,
						   initialVelocity,
						   projectPublic,
						   atomEnabled,
						   currentIterationNumber,
						   currentVelocity,
						   accountId,
						   storyIds,
						   epicIds,
						   membershipIds,
						   labelIds,
						   integrationIds,
						   iterationOverrideNumbers);
	}
}