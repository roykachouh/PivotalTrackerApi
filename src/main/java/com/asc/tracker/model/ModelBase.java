package com.asc.tracker.model;

import com.asc.tracker.serializer.CustomDateSerializer;
import com.asc.tracker.serializer.JSONSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by kachouh on 6/19/14.
 */
public abstract class ModelBase implements Serializable {

	Integer id;
	DateTime createdAt;
	DateTime updatedAt;
	String kind;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	String toJson() throws JsonProcessingException {
		return new JSONSerializer<>().write(this);
	};
}
