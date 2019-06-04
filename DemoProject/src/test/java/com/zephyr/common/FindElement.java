package com.zephyr.common;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement 
{
	
	WebDriver driver=null;
	

	public FindElement(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	public void handleMultipleEle1(List<WebElement> str1)
	{
	  
	  int count = str1.size();
	  System.out.println("No of Element :"+count);
	  
	
	  
	  for(int i=0;i<count;i++)
	  {
		  int x=str1.get(i).getLocation().getX();
		  {
		  str1.get(i).click();
		  break;
		  }
	  }
	}
	
	public void handleMultipleEle2(List<WebElement> str2)
	{
	  
	  int count = str2.size();
	  System.out.println("No of Element :"+count);
	  str2.get(2).click();
	}
	public void handleMultipleEle3(List<WebElement> str3)
	{
	  
	  int count = str3.size();
	  System.out.println("No of Element :"+count);
	  str3.get(3).click();
}
	public void handleMultipleEle4(List<WebElement> str4)
	{
	  
	  int count = str4.size();
	  System.out.println("No of Element :"+count);
	  str4.get(4).click();
	}
	public void handleMultipleEle5(List<WebElement> str5)
	{
	  
	  int count = str5.size();
	  System.out.println("No of Element :"+count);
	  str5.get(5).click();
	}
}
