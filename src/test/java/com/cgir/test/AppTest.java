package com.cgir.test;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

	String SERVER = "http://127.0.0.1:5001";

	String CURRENT_VERSION = "1.1";

	RestRequester _restRequester;

	@Before
	public void init() {
		_restRequester = new RestRequester();
	}

	@Test
	public void test001_getAliceVersion_mustBeCurrentVersion() {
		String serviceVersion = _restRequester.getRequest(SERVER + "/alice/rest/alice/version");
		Assert.assertEquals(CURRENT_VERSION, serviceVersion);
	}

}
