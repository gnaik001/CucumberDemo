package com.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class ExtentReportsUtility 
{
	static ExtentReports reports;
	static ExtentTest logger;
	
	public static void testCaseSuiteStart(String filePath,String userName) throws UnknownHostException
	{
		
		reports = new ExtentReports(filePath, false, NetworkMode.OFFLINE);
		reports.addSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
		reports.addSystemInfo("Environment", "QA");
		reports.addSystemInfo("Username", userName);	
		
	}
	
	public static void testCaseSuiteEnd()
	{
		reports.flush(); // Here simply it means it saves the all test cases in report
		reports.close();
		
	}
	
	public static void testCaseStart(String testName,String description)
	{
		logger=reports.startTest(testName);
	}
	
	public static void testCaseEnd()
	{
		reports.endTest(logger);
	}
	
	public static void stepDetails(String status,String stepName,String stepDetails,String ssPath)
	{
		stepDetails+="<br/>"+logger.addScreenCapture(ssPath);
		
		if(status.equalsIgnoreCase("PASS"))
		{
			logger.log(LogStatus.PASS, stepDetails);
		} else if(status.equalsIgnoreCase("FAIL"))
		{
			logger.log(LogStatus.FAIL, stepDetails);
		} else if(status.equalsIgnoreCase("ERROR"))
		{
			logger.log(LogStatus.ERROR, stepDetails);
		} else if(status.equalsIgnoreCase("FATAL"))
		{
			logger.log(LogStatus.FATAL, stepDetails);
		} else
		{
			logger.log(LogStatus.INFO, stepDetails);
		}
	}
}
