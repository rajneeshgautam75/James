package com.zephyr.reusablemethods;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zephyr.pom.ProjectPage_POM;

public class ProjectPage extends ProjectPage_POM 
{
	WebDriver driver;
	public Logger log;
	BasePage bp;
	
	public ProjectPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		log=Logger.getLogger(this.getClass());
	    Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
		BasicConfigurator.configure();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	
	public void clickOnManageRelease() throws Exception
	{
		try
		{
		manage_Release_Button.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}


	public String fetchRoleMsg()
	{
	
	  role=rolemsg.getText();
	  log.info("Role= "+role);
	   
	   return role;
	}
	
	
	
public boolean verifyProjecttitle()
{
	String proTitle=driver.getTitle();
	log.info("Project Tiltle-"+proTitle);
	return true;
}
//main

/* ****************************************************
   * Method Name   : selectProject(String projectName) 
  * Purpose    : To select Project 
  * Author    : OPAL1
  * Date Created   : 27/07/17
  * Date Modified  :
  * Reviewed By   : Opal4
  * ******************************************************
  */
public boolean selectProject(String projectName) throws Exception 
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	project.isEnabled();
	project.isDisplayed();
	bp.waitForElement();
	bp.waitForElement();
	WebDriverWait wait2=new WebDriverWait(driver, 100);
	wait2.until(ExpectedConditions.elementToBeClickable(project));
	project.click();
	bp.waitForElement();
	String validate_Project=driver.findElement(By.xpath(project1+projectName+project2)).getText();
	 
	if(projectName.equals(validate_Project))
	{

		driver.findElement(By.xpath(project1+projectName+project2)).click();
		//log.info("Pass - "+projectName+"Project Is Selected");
		log.info("Pass - '"+projectName+"' Project Is Selected");
		log.info("Pass - You are in '"+projectName+"' now");
	}
	
	else
	{
		log.info("Fail -Project-'"+projectName+"' is not Available");
		
    }
	  return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}


/* ****************************************************
   * Method Name   : selectRelease(String releaseName) 
  * Purpose    : To select Release
  * Author    : OPAL1
  * Date Created   : 27/07/17
  * Date Modified  :
  * Reviewed By   : Opal4
  * ******************************************************
  */
public boolean selectRelease(String releaseName) throws Exception 
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	bp.waitForElement();
	//String validateRelease=driver.findElement(By.xpath(release1+releaseName+release2)).getText();
	driver.findElement(By.xpath(release1+releaseName+release2)).click();
	bp.waitForElement();
	String validate_Release=validateRelease.getText();
	
	if(releaseName.equalsIgnoreCase(validate_Release))
	   {
		 
			log.info("Pass - You are in the "+releaseName);
			//System.out.println("Pass - You are in the '"+releaseName+"' ");
		}
		else
		{
			log.info("Fail - You are not in the "+releaseName);
			//System.out.println("Fail - you are not in the '"+releaseName+"' ");

		}
	return true;
}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}

	
	
}

/* ****************************************************
   * Method Name   : clickOnLogout()
  * Purpose    : clickOnLogout()
  * Author    : OPAL1
  * Date Created   : 27/07/17
  * Date Modified  :
  * Reviewed By   : Opal4
  * ******************************************************
  */
public boolean clickOnLogout() throws Exception
{
	try
	{
		 bp=new BasePage();
		
	bp.waitForElement();
	user_option.click();
	bp.waitForElement();
	logout.click();
	//driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
	bp.waitForElement();
	return true;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}


/* ****************************************************
   * Method Name   : closeBrowser()
  * Purpose    : For closing the browser
  * Author    : OPAL1
  * Date Created   : 27/07/17
  * Date Modified  :
  * Reviewed By   : Opal4
  * ******************************************************
  */
public boolean closeBrowser() throws Exception
{
	try
	{
	driver.quit();
   log.info("Finalising Frmework");
   
   return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}



public boolean selectProjectDD(String projectName) throws Exception 
{
	try
	{
	BasePage bp=new BasePage();
	bp.waitForElement();
	project.isEnabled();
	project.isDisplayed();
	bp.waitForElement();
	bp.waitForElement();
	WebDriverWait wait2=new WebDriverWait(driver, 50);
	wait2.until(ExpectedConditions.elementToBeClickable(project));
	project.click();
	bp.waitForElement();
	
	
	
	WebElement ele=driver.findElement(By.xpath("//*[text()='Go to Project']"));
	ele.click();
	bp.waitForElement();
	bp.waitForElement();
	//WebElement el1=driver.findElement(By.xpath("//*[@class='select2-search__field']"));
	//Actions a1=new Actions(driver);
	//a1.moveToElement(el1).sendKeys(projectName).pause(1400).sendKeys(Keys.ENTER).perform();
	String validate_Project=driver.findElement(By.xpath(project1+projectName+project2)).getText();
	 
	if(projectName.equals(validate_Project))
	{

		driver.findElement(By.xpath(project1+projectName+project2)).click();
		//log.info("Pass - "+projectName+"Project Is Selected");
		log.info("Pass - '"+projectName+"' Project Is Selected");
		log.info("Pass - You are in '"+projectName+"' now");
	}
	
	else
	{
		log.info("Fail -Project-'"+projectName+"' is not Available");
		
    }
	  return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
}
}
