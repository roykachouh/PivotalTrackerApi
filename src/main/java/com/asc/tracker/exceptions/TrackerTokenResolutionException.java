package com.asc.tracker.exceptions;

/**
 * Created by kachouh on 7/17/14.
 */
public class TrackerTokenResolutionException extends RuntimeException {

  public TrackerTokenResolutionException() {
    super();
  }

  public TrackerTokenResolutionException(String message) {
    super(message);
  }

  public TrackerTokenResolutionException(String message, Throwable cause) {
    super(message, cause);
  }

  public TrackerTokenResolutionException(Throwable cause) {
    super(cause);
  }

  protected TrackerTokenResolutionException(String message,
      Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
