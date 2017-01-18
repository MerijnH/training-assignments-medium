package com.netflix.simianarmy.aws.janitor.rule.ami;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test; // JUnit kan ook

import com.netflix.simianarmy.MonkeyCalendar;
import com.netflix.simianarmy.aws.AWSResource;
import com.netflix.simianarmy.aws.AWSResourceType;
import com.netflix.simianarmy.basic.BasicCalendar;
import com.netflix.simianarmy.basic.BasicConfiguration;

public class TestUnusedImageRule {
	@Test
	public void testIsValidImage() {
		// ASSEMBLE
		AWSResource resource = new AWSResource();
		resource.setResourceType(AWSResourceType.ASG); // elke andere dan IMAGE
		MonkeyCalendar aap = new BasicCalendar(new BasicConfiguration(new Properties()));// vanwege
																							// alle
																							// interfaces
																							// telkens
																							// dieper
																							// gegaan
		UnusedImageRule rule = new UnusedImageRule(aap, 0, 0);

		// ACT
		boolean result = rule.isValid(resource);
		// ASSERT
		Assert.assertTrue(result);
	}

}
