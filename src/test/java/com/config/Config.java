package com.config;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.controller.Controller;

public class Config 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static FileInputStream fin;
	public static Properties properties;
	
	public static String getXPath(String xPathKey)
	{
		try 
		{
			fin = new FileInputStream("src/test/resources/or.properties");
			
			properties = new Properties();
			
			properties.load(fin);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return properties.getProperty(xPathKey);
	}
	
}
