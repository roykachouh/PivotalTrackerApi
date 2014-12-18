package com.asc.tracker.builders;

import java.util.List;

import com.asc.tracker.model.Comment;

public class CommentBuilder {

  private Integer storyId;

  private Integer epicId;

  private String text;

  private Integer personId;

  private List<Integer> fileAttachmentIds;

  private List<Integer> googleAttachmentIds;

  private String commentIdentifier;

  private String commitType;

  public CommentBuilder withStoryId(Integer storyId) {
    this.storyId = storyId;
    return this;
  }

  public CommentBuilder withEpicId(Integer epicId) {
    this.epicId = epicId;
    return this;
  }

  public CommentBuilder withText(String text) {
    this.text = text;
    return this;
  }

  public CommentBuilder withPersonId(Integer personId) {
    this.personId = personId;
    return this;
  }

  public CommentBuilder withFileAttachmentIds(List<Integer> fileAttachmentIds) {
    this.fileAttachmentIds = fileAttachmentIds;
    return this;
  }

  public CommentBuilder withGoogleAttachmentIds(List<Integer> googleAttachmentIds) {
    this.googleAttachmentIds = googleAttachmentIds;
    return this;
  }

  public CommentBuilder withCommentIdentifier(String commentIdentifier) {
    this.commentIdentifier = commentIdentifier;
    return this;
  }

  public CommentBuilder withCommitType(String commitType) {
    this.commitType = commitType;
    return this;
  }

  public Comment createComment() {
    return new Comment(storyId,
        epicId,
        text,
        personId,
        fileAttachmentIds,
        googleAttachmentIds,
        commentIdentifier,
        commitType);
  }
}