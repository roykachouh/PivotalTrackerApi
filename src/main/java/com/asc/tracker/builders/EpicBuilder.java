package com.asc.tracker.builders;

import java.util.List;

import com.asc.tracker.model.Epic;

public class EpicBuilder {

  private Integer projectId;

  private String name;

  private Integer labelId;

  private String description;

  private List<Integer> commentIds;

  private List<Integer> followerIds;

  private Integer afterId;

  private Integer beforeId;

  private String url;

  public EpicBuilder withProjectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  public EpicBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public EpicBuilder withLabelId(Integer labelId) {
    this.labelId = labelId;
    return this;
  }

  public EpicBuilder withDescription(String description) {
    this.description = description;
    return this;
  }

  public EpicBuilder withCommentIds(List<Integer> commentIds) {
    this.commentIds = commentIds;
    return this;
  }

  public EpicBuilder withFollowerIds(List<Integer> followerIds) {
    this.followerIds = followerIds;
    return this;
  }

  public EpicBuilder withAfterId(Integer afterId) {
    this.afterId = afterId;
    return this;
  }

  public EpicBuilder withBeforeId(Integer beforeId) {
    this.beforeId = beforeId;
    return this;
  }

  public EpicBuilder withUrl(String url) {
    this.url = url;
    return this;
  }

  public Epic createEpic() {
    return new Epic(projectId, name, labelId, description, commentIds, followerIds, afterId, beforeId, url);
  }
}