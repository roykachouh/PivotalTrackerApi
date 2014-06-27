package com.asc.tracker.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Created by kachouh on 6/25/14.
 */
public interface Serializer<T> {

	T read(String content);

	String write(T content) throws JsonProcessingException;
}
