package com.asc.tracker.model;

import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by kachouh on 6/20/14.
 */
public class Account extends ModelBase {
	private String name;
	private String plan;
	private AccountStatus status;
	private Integer daysLeft;
	private Boolean overTheLimit;
	private DateTime createdAt;
	private DateTime updatedAt;
	private List<Integer> projectIds;

	public Account(){}

	public Account(String name, String plan, AccountStatus status, Integer daysLeft, Boolean overTheLimit, DateTime createdAt, DateTime updatedAt, List<Integer> projectIds) {
		this.name = name;
		this.plan = plan;
		this.status = status;
		this.daysLeft = daysLeft;
		this.overTheLimit = overTheLimit;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.projectIds = projectIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public Integer getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(Integer daysLeft) {
		this.daysLeft = daysLeft;
	}

	public Boolean getOverTheLimit() {
		return overTheLimit;
	}

	public void setOverTheLimit(Boolean overTheLimit) {
		this.overTheLimit = overTheLimit;
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

	public List<Integer> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}
}
