package com.asc.tracker.interceptors;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import com.asc.tracker.utils.HttpParameterDecorator;

/**
 * Created by kachouh on 7/16/14.
 */
public class PivotalTokenParameterRequestInterceptor implements ClientHttpRequestInterceptor {

  private final String parameterName;

  private final String accessToken;

  public PivotalTokenParameterRequestInterceptor(String accessToken, String parameterName) {
    this.accessToken = accessToken;
    this.parameterName = parameterName;
  }

  public PivotalTokenParameterRequestInterceptor(String accessToken) {
    this(accessToken, "token");
  }

  @Override
  public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
      throws IOException {
    HttpParameterDecorator requestDecorator = new HttpParameterDecorator(request);
    requestDecorator.addParameter(parameterName, accessToken);
    return execution.execute(requestDecorator, body);
  }
}
