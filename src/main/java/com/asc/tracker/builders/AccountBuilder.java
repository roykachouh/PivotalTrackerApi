package com.asc.tracker.builders;

import java.util.List;

import org.joda.time.DateTime;
import com.asc.tracker.model.Account;
import com.asc.tracker.model.AccountStatus;

public class AccountBuilder {

  private String name;

  private String plan;

  private AccountStatus status;

  private Integer daysLeft;

  private Boolean overTheLimit;

  private DateTime createdAt;

  private DateTime updatedAt;

  private List<Integer> projectIds;

  public AccountBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public AccountBuilder withPlan(String plan) {
    this.plan = plan;
    return this;
  }

  public AccountBuilder withStatus(AccountStatus status) {
    this.status = status;
    return this;
  }

  public AccountBuilder withDaysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
    return this;
  }

  public AccountBuilder withOverTheLimit(Boolean overTheLimit) {
    this.overTheLimit = overTheLimit;
    return this;
  }

  public AccountBuilder withCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public AccountBuilder withUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public AccountBuilder withProjectIds(List<Integer> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public Account createAccount() {
    return new Account(name, plan, status, daysLeft, overTheLimit, createdAt, updatedAt, projectIds);
  }
}