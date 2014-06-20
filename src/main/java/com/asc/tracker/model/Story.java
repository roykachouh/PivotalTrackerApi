
package com.asc.tracker.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Story {
	Integer id;

	@JsonProperty("project_id")
	Integer projectId;

	String name;

	String description;

	@JsonProperty("story_type")
	StoryType storyType;

	@JsonProperty("current_state")
	CurrentState currentState;

	Float estimate;

	@JsonProperty("accepted_at")
	DateTime acceptedAt;

	DateTime deadline;

	@JsonProperty("requested_by_id")
	Integer requestedById;

	@JsonProperty("owner_ids")
	List<Integer> ownerIds;

	@JsonProperty("task_ids")
	List<Integer> taskIds;

	@JsonProperty("follower_ids")
	List<Integer> followerIds;

	@JsonProperty("comment_ids")
	List<Integer> commentIds;

	@JsonProperty("created_at")
	DateTime createdAt;

	@JsonProperty("updated_at")
	DateTime updatedAt;

	@JsonProperty("integration_id")
	Integer integrationId;

	@JsonProperty("external_id")
	String externalId;

	String url;

	String kind;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Float getEstimate() {
		return estimate;
	}

	public void setEstimate(Float estimate) {
		this.estimate = estimate;
	}

	public DateTime getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(DateTime acceptedAt) {
		this.acceptedAt = acceptedAt;
	}

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

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
