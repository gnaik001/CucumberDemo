package com.utils;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.config.Config;
import com.google.common.io.Files;

public class ScreenShotUtitlity extends Config
{
	static File src;
	static File dest;
	
	public static String getScreenShot(String fileName)
	{
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		src = sc.getScreenshotAs(OutputType.FILE);
		
		dest = new File("./ScreenShots/"+fileName+".PNG");
		
		try 
		{
			Files.copy(src, dest);
			
			// FileUtils.copyFile(src, dest); // apache io
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return dest.getAbsolutePath();
	}
}
