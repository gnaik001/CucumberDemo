package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber"},
		features = {"src/test/resources/featurefiles/Login.feature"},
		monochrome = true,
		dryRun = false,
		//tags = {"@SmokeTest, @EndToEnd"},
		glue = {"com.stepdefinations"}
		)

public class TestRunner {

}
