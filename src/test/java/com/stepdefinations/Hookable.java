package com.stepdefinations;

import org.apache.log4j.Logger;

import com.utils.ExtentReportsUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable 
{
	public static int stepCount;
	static int scenarioCount;
	static Logger logger = Logger.getLogger(Hookable.class);
	public static int userNameCount,passWordCount, submitCount, errorMessageCount;
	
	@Before
	public static void beforeScenario(Scenario scenario)
	{
		stepCount = 0;
		scenarioCount++;
		userNameCount++;
		passWordCount++;
		submitCount++;
		errorMessageCount++;
		
		try 
		{
			ExtentReportsUtility.testCaseSuiteStart("./Reports/testResult.html", "Demo");
			
			ExtentReportsUtility.testCaseStart("Scenario "+scenarioCount+" : "+scenario.getName(), "");
			
			logger.info("Scenario "+scenarioCount+" : "+scenario.getName());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@After
	public static void afterScenario(Scenario scenario)
	{
		ExtentReportsUtility.testCaseEnd();
		
		ExtentReportsUtility.testCaseSuiteEnd();
		
		logger.info("========================== End Of Scenario ==============================");
	}
}
