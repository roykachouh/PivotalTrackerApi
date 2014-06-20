package com.asc.tracker.model;

import org.joda.time.DateTime;

/**
 * Created by kachouh on 6/20/14.
 */
public class ProjectMembership extends ModelBase {
	Integer personId;
	Integer projectId;
	Role role;
	String projectColor;
	DateTime lastViewedAt;
	Boolean wantsCommentNotificationEmails;
	Boolean willReceiveMentionNotificationsOrEmails;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getProjectColor() {
		return projectColor;
	}

	public void setProjectColor(String projectColor) {
		this.projectColor = projectColor;
	}

	public DateTime getLastViewedAt() {
		return lastViewedAt;
	}

	public void setLastViewedAt(DateTime lastViewedAt) {
		this.lastViewedAt = lastViewedAt;
	}

	public Boolean getWantsCommentNotificationEmails() {
		return wantsCommentNotificationEmails;
	}

	public void setWantsCommentNotificationEmails(Boolean wantsCommentNotificationEmails) {
		this.wantsCommentNotificationEmails = wantsCommentNotificationEmails;
	}

	public Boolean getWillReceiveMentionNotificationsOrEmails() {
		return willReceiveMentionNotificationsOrEmails;
	}

	public void setWillReceiveMentionNotificationsOrEmails(Boolean willReceiveMentionNotificationsOrEmails) {
		this.willReceiveMentionNotificationsOrEmails = willReceiveMentionNotificationsOrEmails;
	}
}
