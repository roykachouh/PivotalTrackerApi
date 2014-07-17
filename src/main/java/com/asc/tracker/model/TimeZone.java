package com.asc.tracker.model;

/**
 * Created by kachouh on 7/17/14.
 */
public class TimeZone {
	String kind;
	String olsonName;
	String offset;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getOlsonName() {
		return olsonName;
	}

	public void setOlsonName(String olsonName) {
		this.olsonName = olsonName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}
}
