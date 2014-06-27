package com.asc.tracker.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/**
 * Created by kachouh on 6/24/14.
 */
public class JSONSerializer<T> implements Serializer<T> {
	private ObjectMapper objectMapper = new ObjectMapper();

	public JSONSerializer() {
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
	}



	@Override
	public T read(String content) {
		return null;
	}

	@Override
	public String write(T content) throws JsonProcessingException {
		return objectMapper.writeValueAsString(content);
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}
}
