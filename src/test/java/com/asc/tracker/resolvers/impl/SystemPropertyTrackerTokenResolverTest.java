package com.asc.tracker.resolvers.impl;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class SystemPropertyTrackerTokenResolverTest {

  @Test
  public void testCommandLineTrackerResolution() {
    System.setProperty("tracker.token", "whatever");

    assertThat(new SystemPropertyTrackerTokenResolver().resolveTokenOrFail()).isNotNull();
  }
}