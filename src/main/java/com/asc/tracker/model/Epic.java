package com.asc.tracker.model;

import java.util.List;

/**
 * Created by kachouh on 6/20/14.
 */
public class Epic extends ModelBase {

  Integer projectId;

  String name;

  Integer labelId;

  String description;

  List<Integer> commentIds;

  List<Integer> followerIds;

  public Epic(Integer projectId,
      String name,
      Integer labelId,
      String description,
      List<Integer> commentIds,
      List<Integer> followerIds,
      Integer afterId,
      Integer beforeId,
      String url) {
    this.projectId = projectId;
    this.name = name;
    this.labelId = labelId;
    this.description = description;
    this.commentIds = commentIds;
    this.followerIds = followerIds;
    this.afterId = afterId;
    this.beforeId = beforeId;
    this.url = url;
  }

  Integer afterId;

  Integer beforeId;

  String url;

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

  public Integer getLabelId() {
    return labelId;
  }

  public void setLabelId(Integer labelId) {
    this.labelId = labelId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Integer> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(List<Integer> commentIds) {
    this.commentIds = commentIds;
  }

  public List<Integer> getFollowerIds() {
    return followerIds;
  }

  public void setFollowerIds(List<Integer> followerIds) {
    this.followerIds = followerIds;
  }

  public Integer getAfterId() {
    return afterId;
  }

  public void setAfterId(Integer afterId) {
    this.afterId = afterId;
  }

  public Integer getBeforeId() {
    return beforeId;
  }

  public void setBeforeId(Integer beforeId) {
    this.beforeId = beforeId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
