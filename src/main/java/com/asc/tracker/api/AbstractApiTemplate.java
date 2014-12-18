package com.asc.tracker.api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import com.asc.tracker.interceptors.PivotalTokenParameterRequestInterceptor;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * Created by kachouh on 7/16/14.
 */
public abstract class AbstractApiTemplate {

  private RestTemplate restTemplate;

  public static final String PIVOTAL_BASE_ENDPOINT = "https://www.pivotaltracker.com/services/v5/";

  private List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();

  private RestTemplate initRestTemplate() {
    restTemplate = new RestTemplate();
    restTemplate.setInterceptors(initializeTokenInterceptor());

    MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
    jackson2HttpMessageConverter.getObjectMapper()
        .setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
    jackson2HttpMessageConverter.getObjectMapper().registerModule(new JodaModule());

    messageConverters.add(jackson2HttpMessageConverter);
    restTemplate.setMessageConverters(messageConverters);

    return restTemplate;
  }

  private List<ClientHttpRequestInterceptor> initializeTokenInterceptor() {
    List<ClientHttpRequestInterceptor> interceptors = new LinkedList<>();
    interceptors.add(new PivotalTokenParameterRequestInterceptor(getTokenOrFail()));
    return interceptors;
  }

  private String getTokenOrFail() {
    String token = System.getProperty("tracker.token");
    if (token == null) {
      throw new IllegalStateException("Could not initialize tracker api, tracker token was not found");
    }

    return token;
  }

  public RestTemplate getRestTemplate() {
    if (restTemplate == null) {
      this.restTemplate = initRestTemplate();
    }
    return restTemplate;
  }
}
