package com.asc.tracker.builders;

import com.asc.tracker.model.FileAttachment;

public class FileAttachmentBuilder {

  private String filename;

  private Integer uploaderId;

  private Boolean thumbnailable;

  private Integer height;

  private Integer width;

  private Integer size;

  private String downloadUrl;

  private String contentType;

  private Boolean uploaded;

  private String bigUrl;

  private String thumbnailUrl;

  public FileAttachmentBuilder withFilename(String filename) {
    this.filename = filename;
    return this;
  }

  public FileAttachmentBuilder withUploaderId(Integer uploaderId) {
    this.uploaderId = uploaderId;
    return this;
  }

  public FileAttachmentBuilder withThumbnailable(Boolean thumbnailable) {
    this.thumbnailable = thumbnailable;
    return this;
  }

  public FileAttachmentBuilder withHeight(Integer height) {
    this.height = height;
    return this;
  }

  public FileAttachmentBuilder withWidth(Integer width) {
    this.width = width;
    return this;
  }

  public FileAttachmentBuilder withSize(Integer size) {
    this.size = size;
    return this;
  }

  public FileAttachmentBuilder withDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  public FileAttachmentBuilder withContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public FileAttachmentBuilder withUploaded(Boolean uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  public FileAttachmentBuilder withBigUrl(String bigUrl) {
    this.bigUrl = bigUrl;
    return this;
  }

  public FileAttachmentBuilder withThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  public FileAttachment createFileAttachment() {
    return new FileAttachment(filename,
        uploaderId,
        thumbnailable,
        height,
        width,
        size,
        downloadUrl,
        contentType,
        uploaded,
        bigUrl,
        thumbnailUrl);
  }
}