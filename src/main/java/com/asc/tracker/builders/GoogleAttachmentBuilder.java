package com.asc.tracker.builders;

import com.asc.tracker.model.GoogleAttachment;

public class GoogleAttachmentBuilder {

  private Integer commentId;

  private Integer personId;

  private String googleKind;

  private String title;

  private String googleId;

  private String alternateLink;

  private String resourceId;

  public GoogleAttachmentBuilder withCommentId(Integer commentId) {
    this.commentId = commentId;
    return this;
  }

  public GoogleAttachmentBuilder withPersonId(Integer personId) {
    this.personId = personId;
    return this;
  }

  public GoogleAttachmentBuilder withGoogleKind(String googleKind) {
    this.googleKind = googleKind;
    return this;
  }

  public GoogleAttachmentBuilder withTitle(String title) {
    this.title = title;
    return this;
  }

  public GoogleAttachmentBuilder withGoogleId(String googleId) {
    this.googleId = googleId;
    return this;
  }

  public GoogleAttachmentBuilder withAlternateLink(String alternateLink) {
    this.alternateLink = alternateLink;
    return this;
  }

  public GoogleAttachmentBuilder withResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public GoogleAttachment createGoogleAttachment() {
    return new GoogleAttachment(commentId, personId, googleKind, title, googleId, alternateLink, resourceId);
  }
}