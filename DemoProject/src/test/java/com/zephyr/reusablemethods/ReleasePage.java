package com.zephyr.reusablemethods;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zephyr.common.LaunchBrowser;
import com.zephyr.pom.ReleasePage_POM;

public class ReleasePage extends ReleasePage_POM
{
	WebDriver driver;
	BasePage bp;
	
	public Logger log;
	public ReleasePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
		BasicConfigurator.configure();
		
    }


	/* ****************************************************
	   * Method Name   : clickOnTestRep()
	  * Purpose    : To click On TestRepository
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean clickOnTestRep() throws Exception
	{
		try
		{
    boolean st2=testRepository.isEnabled();
	boolean st3=testRepository.isDisplayed();
	//System.out.println(st2);
	//System.out.println(st3);
	
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
    wait1.until(ExpectedConditions.elementToBeClickable(testRepository));
    testRepository.click();
    bp=new BasePage();
    bp.waitForElement();
    bp.waitForElement();
    log.info("Successfully Landed on Test Repository Page");

    //list_Tab.click();
    //bp.waitForElement();
    String validate_TestRepository=validateRepository.getText();
    String expmsg="Test Repository";
    if(validate_TestRepository.equals(expmsg))
   {
    	log.info("Successfully Landed on Test Repository Page");
//    
	}
//    
    else
    {
   	   log.info("You are not in Test Repository Page");
   
    }
    return true;
	}
    catch(Exception e)
    {
    	e.printStackTrace();
    	log.info("Test Repository is not Clicked");
    	throw e;
    	
    }
}
	
	/* ****************************************************
	   * Method Name   : clickOnRequirements() 
	  * Purpose    : To click On Requirements
	  * Author    : OPAL1
	  * Date Created   : 27/07/17
	  * Date Modified  :
	  * Reviewed By   : Opal4
	  * ******************************************************
	  */
	public boolean clickOnRequirements() throws Exception
	 {
		try
		{
	    boolean st4=requirements.isEnabled();
	 boolean st5=requirements.isDisplayed();
	 //System.out.println(st2);
	 //System.out.println(st3);
	 
	 //WebElement element1=driver.findElement(By.xpath("//a[@title='Test Repository']"));
	 WebDriverWait wait1 = new WebDriverWait(driver, 30);
	    wait1.until(ExpectedConditions.elementToBeClickable(requirements));
	    requirements.click();
	    bp=new BasePage();
	    bp.waitForElement();
	    log.info("Successfully Landed on Requirements Page");
	 //element1.click();
	 
	    String validate_Requirements=validateRequirements.getText();
	    return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	 
	}
}