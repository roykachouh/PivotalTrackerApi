package com.asc.tracker.resolvers.impl;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class SystemPropertyTrackerTokenResolverTest {

	@Test
	public void testCommandLineTrackerResolution() {
		System.setProperty("tracker.token","whatever");

		assertThat(new SystemPropertyTrackerTokenResolver().resolveTokenOrFail()).isNotNull();
	}
}