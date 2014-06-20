
package com.asc.tracker.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment extends ModelBase {

	@JsonProperty("story_id")
	Integer storyId;

	@JsonProperty("epic_id")
	Integer epicId;

	String text;

	@JsonProperty("person_id")
	Integer personId;

	@JsonProperty("file_attachment_ids")
	List<Integer> fileAttachmentIds;

	@JsonProperty("google_attachment_ids")
	List<Integer> googleAttachmentIds;

	@JsonProperty("comment_identifier")
	String commentIdentifier;

	@JsonProperty("commit_type")
	String commitType;

	String kind;

	public Integer getStoryId() {
		return storyId;
	}

	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}

	public Integer getEpicId() {
		return epicId;
	}

	public void setEpicId(Integer epicId) {
		this.epicId = epicId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public List<Integer> getFileAttachmentIds() {
		return fileAttachmentIds;
	}

	public void setFileAttachmentIds(List<Integer> fileAttachmentIds) {
		this.fileAttachmentIds = fileAttachmentIds;
	}

	public List<Integer> getGoogleAttachmentIds() {
		return googleAttachmentIds;
	}

	public void setGoogleAttachmentIds(List<Integer> googleAttachmentIds) {
		this.googleAttachmentIds = googleAttachmentIds;
	}

	public String getCommentIdentifier() {
		return commentIdentifier;
	}

	public void setCommentIdentifier(String commentIdentifier) {
		this.commentIdentifier = commentIdentifier;
	}

	public String getCommitType() {
		return commitType;
	}

	public void setCommitType(String commitType) {
		this.commitType = commitType;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
}
