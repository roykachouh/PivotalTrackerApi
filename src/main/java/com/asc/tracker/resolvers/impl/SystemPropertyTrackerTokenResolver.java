package com.asc.tracker.resolvers.impl;

import com.asc.tracker.exceptions.TrackerTokenResolutionException;
import com.asc.tracker.resolvers.TrackerTokenResolver;

/**
 * Created by kachouh on 7/17/14.
 */
public class SystemPropertyTrackerTokenResolver implements TrackerTokenResolver {

  @Override
  public String resolveTokenOrFail() throws TrackerTokenResolutionException {
    String trackerToken = System.getProperty("tracker.token");

    if (trackerToken == null) {
      throw new TrackerTokenResolutionException("Could not initialize tracker api, token was not specified");
    }

    return trackerToken;
  }
}
