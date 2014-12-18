package com.asc.tracker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment extends ModelBase {

  Integer storyId;

  Integer epicId;

  String text;

  Integer personId;

  List<Integer> fileAttachmentIds;

  List<Integer> googleAttachmentIds;

  String commentIdentifier;

  String commitType;

  public Comment(Integer storyId,
      Integer epicId,
      String text,
      Integer personId,
      List<Integer> fileAttachmentIds,
      List<Integer> googleAttachmentIds,
      String commentIdentifier,
      String commitType) {
    this.storyId = storyId;
    this.epicId = epicId;
    this.text = text;
    this.personId = personId;
    this.fileAttachmentIds = fileAttachmentIds;
    this.googleAttachmentIds = googleAttachmentIds;
    this.commentIdentifier = commentIdentifier;
    this.commitType = commitType;
  }

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
}
