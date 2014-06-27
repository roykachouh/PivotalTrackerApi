
package com.asc.tracker.model;

import com.asc.tracker.serializer.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude ( JsonInclude.Include.NON_NULL )
public class Story extends ModelBase {
	Integer projectId;
	String name;
	String description;
	StoryType storyType;
	CurrentState currentState;
	BigDecimal estimate;
	DateTime acceptedAt;
	DateTime deadline;
	Integer requestedById;
	List<Integer> ownerIds;
	List<Integer> taskIds;
	List<Integer> followerIds;
	List<Integer> commentIds;
	List<Integer> labelIds;
	Integer integrationId;
	String externalId;
	String url;

	public Story(Integer projectId, String name, String description, StoryType storyType, CurrentState currentState, BigDecimal estimate, DateTime acceptedAt, DateTime deadline, Integer requestedById, List<Integer> ownerIds, List<Integer> taskIds, List<Integer> followerIds, List<Integer> commentIds, List<Integer> labelIds, Integer integrationId, String externalId, String url) {
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.storyType = storyType;
		this.currentState = currentState;
		this.estimate = estimate;
		this.acceptedAt = acceptedAt;
		this.deadline = deadline;
		this.requestedById = requestedById;
		this.ownerIds = ownerIds;
		this.taskIds = taskIds;
		this.followerIds = followerIds;
		this.commentIds = commentIds;
		this.labelIds = labelIds;
		this.integrationId = integrationId;
		this.externalId = externalId;
		this.url = url;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StoryType getStoryType() {
		return storyType;
	}

	public void setStoryType(StoryType storyType) {
		this.storyType = storyType;
	}

	public CurrentState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CurrentState currentState) {
		this.currentState = currentState;
	}

	public BigDecimal getEstimate() {
		return estimate;
	}

	public void setEstimate(BigDecimal estimate) {
		this.estimate = estimate;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public DateTime getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(DateTime acceptedAt) {
		this.acceptedAt = acceptedAt;
	}

	@JsonSerialize (using = CustomDateSerializer.class)
	public DateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(DateTime deadline) {
		this.deadline = deadline;
	}

	public Integer getRequestedById() {
		return requestedById;
	}

	public void setRequestedById(Integer requestedById) {
		this.requestedById = requestedById;
	}

	public List<Integer> getOwnerIds() {
		return ownerIds;
	}

	public void setOwnerIds(List<Integer> ownerIds) {
		this.ownerIds = ownerIds;
	}

	public List<Integer> getTaskIds() {
		return taskIds;
	}

	public void setTaskIds(List<Integer> taskIds) {
		this.taskIds = taskIds;
	}

	public List<Integer> getFollowerIds() {
		return followerIds;
	}

	public void setFollowerIds(List<Integer> followerIds) {
		this.followerIds = followerIds;
	}

	public List<Integer> getCommentIds() {
		return commentIds;
	}

	public void setCommentIds(List<Integer> commentIds) {
		this.commentIds = commentIds;
	}

	public Integer getIntegrationId() {
		return integrationId;
	}

	public void setIntegrationId(Integer integrationId) {
		this.integrationId = integrationId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


}
