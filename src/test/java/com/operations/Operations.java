package com.operations;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.config.Config;
import com.controller.Controller;
import com.relevantcodes.extentreports.LogStatus;
import com.stepdefinations.Hookable;
import com.utils.ExtentReportsUtility;
import com.utils.ScreenShotUtitlity;

public class Operations extends Config
{
	static Logger logger = Logger.getLogger(Operations.class);
	
	public static WebElement getRuntimeObject(String xPath)
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		wait = new WebDriverWait(driver, 20);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
	}
	
	public static void openBrowser(String xPath, String[] list) 
	{
		String browserName = list[0];
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should open chrome browser <br/> Actual Result : Chrome Browser Launched Successfully..!!", ScreenShotUtitlity.getScreenShot("openBrowser"));
			
			logger.info(LogStatus.PASS+" Result : Chrome Browser Launched Successfully..!!");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should open firefox browser <br/> Actual Result : firefox Browser Launched Successfully..!!", ScreenShotUtitlity.getScreenShot("openBrowser"));
			
			logger.info(LogStatus.PASS+" Result : Firefox Browser Launched Successfully..!!");
		}
		else
		{
			System.out.println("No matching driver found..!!!");
			
			logger.error("No matching driver found..!!!");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should open "+list[0]+" browser <br/> Actual Result : Unable to launch browser "+list[0]+" ", "");
		}
	}

	public static void enterURL(String xPath, String[] list) 
	{
		try 
		{
			driver.get(list[0]);
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should enter login page url <br/> Actual Result : Url Entered : "+list[0]+" ", ScreenShotUtitlity.getScreenShot("launchUrl"));
			
			logger.info(LogStatus.PASS+" Result : Url Entered : "+list[0]+" ");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occured : Unable to launch url "+list[0]+" ");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should enter login page url <br/> Actual Result : Failed To Enter Url : "+list[0]+" ", ScreenShotUtitlity.getScreenShot("launchUrlFailed"));
			
			logger.error("Exception Occured : Unable to launch url "+list[0]+" ");
		}
		
		
	}

	public static void LoginPage(String xPath, String[] list) 
	{
		try 
		{
			WebElement AdminLogin = getRuntimeObject(xPath);
			
			if(AdminLogin.getText().equalsIgnoreCase("Administrator Login"))
			{
				System.out.println("Login page verified..!!");
				
				ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should be on login page <br/> Actual Result : Login page Verfied..!!", ScreenShotUtitlity.getScreenShot("LoginPage"));
				
				logger.info("Login page verified..!!");
			}
			else
			{
				System.out.println("Login page not verified..!!");
				
				ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should be on login page <br/> Actual Result : Login page not Verfied..!!", ScreenShotUtitlity.getScreenShot("LoginPageFailed"));
				
				logger.error("Login page not verified..!!");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Unable To locate element..!!");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should be on login page <br/> Actual Result : Unable To locate element..!!", ScreenShotUtitlity.getScreenShot("LoginPageFailed"));
			
			logger.error("Unable To locate element..!!");
		}
	}

	public static void enterUserName(String xPath, String[] list) 
	{
		try 
		{
			WebElement userName = getRuntimeObject(xPath);
			
			userName.clear();
			
			Thread.sleep(1000);
			
			userName.sendKeys(list[0]);
			
			System.out.println("UserName Entered : "+list[0]);
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should enter username = "+list[0]+" <br/> Actual Result : Username Entered = "+list[0], ScreenShotUtitlity.getScreenShot("enterUserName"+Hookable.userNameCount));
			
			logger.info("UserName Entered : "+list[0]);
			
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to enter userName : "+list[0]);
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should enter username = "+list[0]+" <br/> Actual Result : Unable To Enter UserName= "+list[0], ScreenShotUtitlity.getScreenShot("enterUserNameFailed"+Hookable.userNameCount));
			
			logger.error("Unable to enter userName : "+list[0]);
			
		}
	}

	public static void enterPassword(String xPath, String[] list) 
	{
		try 
		{
			WebElement password = getRuntimeObject(xPath);
			
			password.clear();
			
			Thread.sleep(1000);
			
			password.sendKeys(list[0]);
			
			System.out.println("Password Entered : "+list[0]);
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should enter password = "+list[0]+" <br/> Actual Result : password entered = "+list[0], ScreenShotUtitlity.getScreenShot("enterPassword"+Hookable.passWordCount));
			
			logger.info("Password Entered : "+list[0]);
			
		} 
		catch (Exception e) 
		{
			System.out.println("unable to enter password : "+list[0]);
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should enter password = "+list[0]+" <br/> Actual Result : Unable to enter password = "+list[0], ScreenShotUtitlity.getScreenShot("enterPasswordFailed"+Hookable.passWordCount));
			
			logger.error("unable to enter password : "+list[0]);
			
		}
	}

	public static void submit(String xPath, String[] list) 
	{
		try 
		{
			WebElement submitButton = getRuntimeObject(xPath);
			
			submitButton.click();
			
			System.out.println("Clicked on submit Button..!!");
			
			ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should click on submit button <br/> Actual Result : Clicked on submit button.", ScreenShotUtitlity.getScreenShot("SubmitButton"+Hookable.submitCount));
			
			logger.info("Clicked on submit Button..!!");
			
		} 
		catch (Exception e) 
		{
			System.out.println("Unable To Click On Submit Button..!!");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should click on submit button <br/> Actual Result : Unable To Click On Submit Button..!! ", ScreenShotUtitlity.getScreenShot("SubmitButtonFailed"+Hookable.submitCount));
			
			logger.error("Unable To Click On Submit Button..!!");
			
		}
	}

	public static void applicationHomePage(String xPath, String[] list) 
	{
		try 
		{
			WebElement logout = getRuntimeObject(xPath);
			
			if(logout.getText().equalsIgnoreCase("Logoff"))
			{
				System.out.println("Home Page Verified..!!");
				
				ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should be on application's home page <br/> Actual Result : User is on application's home page.", ScreenShotUtitlity.getScreenShot("homePage"));
				
				logger.info("Home Page Verified..!!");
			}
			else
			{
				System.out.println("Home Page Not Verfied..!!");
				
				ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should be on application's home page <br/> Actual Result : User is not on application's home page.", ScreenShotUtitlity.getScreenShot("homePageFailed"));
				
				logger.error("Home Page Not Verified..!!");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to locate element..!!");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : User should be on application's home page <br/> Actual Result : Unable to locate element..!!", ScreenShotUtitlity.getScreenShot("homePageFailed"));
			
			logger.error("Unable to locate element..!!");
		}
	}

	public static void showErrorMessage(String xPath, String[] list) 
	{
		try 
		{
			WebElement erroeMSG = getRuntimeObject(xPath);
			
			if(erroeMSG.getText().equalsIgnoreCase(" Error: Invalid administrator login attempt."))
			{
				System.out.println("Error message displayed and verified..!!");
				
				ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : Error message "+list[0]+" should be displayed <br/> Actual Result : Error message "+erroeMSG.getText()+" is displayed.", ScreenShotUtitlity.getScreenShot("errorMsg"+Hookable.errorMessageCount));
				
				logger.info("Error message displayed and verified..!!");
			}
			else
			{
				System.out.println("Error message Not displayed..!!");
				
				ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : Error message "+list[0]+" should be displayed <br/> Actual Result : Error message "+erroeMSG.getText()+" is not displayed.", ScreenShotUtitlity.getScreenShot("errorMsgFailed"+Hookable.errorMessageCount));
				
				logger.error("Error message Not displayed..!!");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to locate element..!!");
			
			ExtentReportsUtility.stepDetails("FAIL", Controller.stepname, "Expected Result : Error message "+list[0]+" should be displayed <br/> Actual Result : Unable to locate element..!!", ScreenShotUtitlity.getScreenShot("errorMsgFailed"+Hookable.errorMessageCount));
			
			logger.error("Unable to locate element..!!");
		}
	}
	
	public static void closeBrowser(String xPath, String[] list)
	{
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		driver.close();
		
		System.out.println("Browser Closed..!!");
		
		logger.info("Browser Closed..!!");
		
		ExtentReportsUtility.stepDetails("PASS", Controller.stepname, "Expected Result : User should close the browser <br/> Actual Result : Browser Closed..!!", "");
	}
}
