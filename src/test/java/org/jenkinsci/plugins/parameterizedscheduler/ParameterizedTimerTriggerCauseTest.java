package org.jenkinsci.plugins.parameterizedscheduler;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.jenkinsci.plugins.parameterizedscheduler.Messages;
import org.jenkinsci.plugins.parameterizedscheduler.ParameterizedTimerTriggerCause;
import org.junit.Test;

import com.google.common.collect.Maps;

public class ParameterizedTimerTriggerCauseTest {

	@Test
	public void happyPath() {
		Map<String, String> parameters = Maps.newHashMap();
		parameters.put("o", "v");
		ParameterizedTimerTriggerCause testObject = new ParameterizedTimerTriggerCause(parameters);

		assertEquals(Messages.ParameterizedTimerTrigger_TimerTriggerCause_ShortDescription("{o=v}"),
				testObject.getShortDescription());
	}

}
