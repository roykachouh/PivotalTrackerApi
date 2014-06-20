package com.asc.tracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by kachouh on 6/19/14.
 */
public class ModelBase implements Serializable {

	Integer id;
	@JsonProperty ("created_at")
	DateTime createdAt;
	@JsonProperty("updated_at")
	DateTime updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
