package com.controller;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import com.config.Config;
import com.operations.OpearionsList;
import com.stepdefinations.Hookable;

public class Controller extends Config
{
	static String xPath;
	public static String stepname;
	static String methodName;
	Logger logger = Logger.getLogger(Controller.class);
	
	public static void forEachStep(String xPathKey, String stepName, Enum<OpearionsList> operations, String[] list)
	{
		Hookable.stepCount++;
		
		stepName = "Step "+Hookable.stepCount+" : "+ stepName;
		
		System.out.println(stepName);
		
		xPath = getXPath(xPathKey);
		
		methodName = operations.toString();
		
		try 
		{
			
			
			Class<?> obj = Class.forName("com.operations.Operations");
			
			// Class<?> obj = Class.forName("com.operations."+pageName+"Operations");
			
			Method[] methods = obj.getDeclaredMethods();
			
			for(int i=0; i<methods.length; i++)
			{
				if(methods[i].getName().equals(methodName))
				{
					System.out.println("MethodName : " +methods[i]);
					methods[i].invoke(null, xPath, list);
				}
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
