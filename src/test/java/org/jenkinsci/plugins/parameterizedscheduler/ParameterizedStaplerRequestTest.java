package org.jenkinsci.plugins.parameterizedscheduler;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;

import org.jenkinsci.plugins.parameterizedscheduler.ParameterizedStaplerRequest;
import org.junit.Test;

public class ParameterizedStaplerRequestTest {

	@Test
	public void getParameter() {
		String testValue = "testvalue";
		ParameterizedStaplerRequest testObject = new ParameterizedStaplerRequest(testValue);
		assertSame(testValue, testObject.getParameter(null));
	}

	@Test
	public void getParameterValues() {
		String testValue = "testvalue";
		ParameterizedStaplerRequest testObject = new ParameterizedStaplerRequest(testValue);
		assertArrayEquals(new String[] { testValue }, testObject.getParameterValues(null));
	}

}
