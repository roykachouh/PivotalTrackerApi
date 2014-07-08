package com.asc.tracker.builders;

import com.asc.tracker.model.ProjectMembership;
import com.asc.tracker.model.Role;
import org.joda.time.DateTime;

public class ProjectMembershipBuilder {
	private Integer personId;
	private Integer projectId;
	private Role role;
	private String projectColor;
	private DateTime lastViewedAt;
	private Boolean wantsCommentNotificationEmails;
	private Boolean willReceiveMentionNotificationsOrEmails;

	public ProjectMembershipBuilder withPersonId(Integer personId) {
		this.personId = personId;
		return this;
	}

	public ProjectMembershipBuilder withProjectId(Integer projectId) {
		this.projectId = projectId;
		return this;
	}

	public ProjectMembershipBuilder withRole(Role role) {
		this.role = role;
		return this;
	}

	public ProjectMembershipBuilder withProjectColor(String projectColor) {
		this.projectColor = projectColor;
		return this;
	}

	public ProjectMembershipBuilder withLastViewedAt(DateTime lastViewedAt) {
		this.lastViewedAt = lastViewedAt;
		return this;
	}

	public ProjectMembershipBuilder withWantsCommentNotificationEmails(Boolean wantsCommentNotificationEmails) {
		this.wantsCommentNotificationEmails = wantsCommentNotificationEmails;
		return this;
	}

	public ProjectMembershipBuilder withWillReceiveMentionNotificationsOrEmails(Boolean willReceiveMentionNotificationsOrEmails) {
		this.willReceiveMentionNotificationsOrEmails = willReceiveMentionNotificationsOrEmails;
		return this;
	}

	public ProjectMembership createProjectMembership() {
		return new ProjectMembership(personId, projectId, role, projectColor, lastViewedAt, wantsCommentNotificationEmails, willReceiveMentionNotificationsOrEmails);
	}
}