package com.zephyr.reusablemethods;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zephyr.common.LaunchBrowser;

public class BasePage
{
	 public WebDriver driver=null;
 
	 public BasePage()
     {
		
		this.driver = LaunchBrowser.driver;
	 }

   
  
     public void waitTillElementIsVisible(WebElement element)
     {
    	WebDriverWait wait= new WebDriverWait(driver,30);
    	 wait.until(ExpectedConditions.visibilityOf(element));
     }
	

	public void moveToElement(WebElement element)
	{
		  Actions actions=new Actions(driver);
		  actions.moveToElement(element).perform();
		  
  }

	public void moveToElementAndClick(WebElement element)
	{
		  Actions actions=new Actions(driver);
		  actions.moveToElement(element).click().build().perform();
		  
  

	}
	public boolean eraseText(WebElement ele)
	{
		
		Actions a1=new Actions(driver);
		a1.moveToElement(ele).click().build().perform();
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		a1.sendKeys(selectAll).sendKeys(Keys.DELETE).build().perform();
		return true;
		
		
		
	}
	
	public boolean waitForElement() throws InterruptedException
	{
		Thread.sleep(3000);
		return true;
	}
	
	public void alertmsg()
	{
		Alert a1=driver.switchTo().alert();
		a1.getText();
		
				
	}
	public void windowHandle()
	{
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    driver.close();
    driver.switchTo().window(tabs2.get(0));

 }
}
	

