package com.asc.tracker.utils;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kachouh on 7/16/14.
 */
public class HttpParameterDecorator extends HttpRequestWrapper {
	MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

	/**
	 * Creates a new {@code HttpRequest} wrapping the given request object.
	 *
	 * @param request the request object to be wrapped
	 */
	public HttpParameterDecorator(HttpRequest request) {
		super(request);
	}

	public void addParameter(String name, String value) {
		parameters.add(name,value);
	}

	@Override
	public URI getURI() {
		if(parameters.isEmpty()) {
			return super.getURI();
		}

		return new URIBuilder(super.getURI().toString()).build();
	}


	private class URIBuilder {
		private final String baseUri;

		private URIBuilder(String baseUri) {
			this.baseUri = baseUri;
		}

		/**
		 * Builds the URI
		 */
		public URI build() {
			try {
				StringBuilder builder = new StringBuilder();
				Set<Map.Entry<String, List<String>>> entrySet = parameters.entrySet();
				for (Iterator<Map.Entry<String, List<String>>> entryIt = entrySet.iterator(); entryIt.hasNext();) {
					Map.Entry<String, List<String>> entry = entryIt.next();
					String name = entry.getKey();
					List<String> values = entry.getValue();
					for(Iterator<String> valueIt = values.iterator(); valueIt.hasNext();) {
						String value = valueIt.next();
						builder.append(formEncode(name)).append("=");
						if(value != null) {
							builder.append(formEncode(value));
						}
						if(valueIt.hasNext()) {
							builder.append("&");
						}
					}
					if(entryIt.hasNext()) {
						builder.append("&");
					}
				}

				String queryDelimiter = "?";
				if(URI.create(baseUri).getQuery() != null) {
					queryDelimiter = "&";
				}
				return new URI(baseUri + (builder.length() > 0 ? queryDelimiter + builder.toString() : ""));
			} catch (URISyntaxException e) {
				throw new RuntimeException("Unable to build URI: Bad URI syntax", e);
			}
		}

		private String formEncode(String data) {
			try {
				return URLEncoder.encode(data, "UTF-8");
			}
			catch (UnsupportedEncodingException wontHappen) {
				throw new IllegalStateException(wontHappen);
			}
		}
	}
}
