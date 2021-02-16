package com.Runner;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {
			"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
	features = {"./Features/point72.feature"},
	glue = {"com.StepDefination"},
	monochrome = true,
	dryRun = false,
	strict = true,
	tags = {"@Smoke"}
	)
	public class AutomationPracticeRunnerFile extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setup() {
		
	}
	
}
