package com.asc.tracker.resolvers;

import com.asc.tracker.exceptions.TrackerTokenResolutionException;

/**
 * Created by kachouh on 7/17/14.
 */
public interface TrackerTokenResolver {

  String resolveTokenOrFail() throws TrackerTokenResolutionException;
}
