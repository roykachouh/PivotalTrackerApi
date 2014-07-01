package com.asc.tracker.model;

/**
 * Created by kachouh on 6/20/14.
 */
public class FileAttachment extends ModelBase {
	String filename;
	Integer uploaderId;
	Boolean thumbnailable;
	Integer height;
	Integer width;
	Integer size;
	String downloadUrl;
	String contentType;
	Boolean uploaded;
	String bigUrl;
	String thumbnailUrl;

	public FileAttachment(String filename, Integer uploaderId, Boolean thumbnailable, Integer height, Integer width, Integer size, String downloadUrl, String contentType, Boolean uploaded, String bigUrl, String thumbnailUrl) {
		this.filename = filename;
		this.uploaderId = uploaderId;
		this.thumbnailable = thumbnailable;
		this.height = height;
		this.width = width;
		this.size = size;
		this.downloadUrl = downloadUrl;
		this.contentType = contentType;
		this.uploaded = uploaded;
		this.bigUrl = bigUrl;
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Integer getUploaderId() {
		return uploaderId;
	}

	public void setUploaderId(Integer uploaderId) {
		this.uploaderId = uploaderId;
	}

	public Boolean getThumbnailable() {
		return thumbnailable;
	}

	public void setThumbnailable(Boolean thumbnailable) {
		this.thumbnailable = thumbnailable;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Boolean getUploaded() {
		return uploaded;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	public String getBigUrl() {
		return bigUrl;
	}

	public void setBigUrl(String bigUrl) {
		this.bigUrl = bigUrl;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
}
