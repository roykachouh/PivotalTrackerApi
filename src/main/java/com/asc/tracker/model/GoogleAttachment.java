package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class GoogleAttachment extends ModelBase {
	Integer commentId;
	Integer personId;
	String googleKind;
	String title;
	String googleId;
	String alternateLink;
	String resourceId;

	public GoogleAttachment(Integer commentId, Integer personId, String googleKind, String title, String googleId, String alternateLink, String resourceId) {
		this.commentId = commentId;
		this.personId = personId;
		this.googleKind = googleKind;
		this.title = title;
		this.googleId = googleId;
		this.alternateLink = alternateLink;
		this.resourceId = resourceId;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getGoogleKind() {
		return googleKind;
	}

	public void setGoogleKind(String googleKind) {
		this.googleKind = googleKind;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public String getAlternateLink() {
		return alternateLink;
	}

	public void setAlternateLink(String alternateLink) {
		this.alternateLink = alternateLink;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
}
