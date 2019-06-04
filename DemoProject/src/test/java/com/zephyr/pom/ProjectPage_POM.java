package com.zephyr.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zephyr.common.LaunchBrowser;

public class ProjectPage_POM 
{

	WebDriver driver=null;

 @FindBy(xpath="//*[@id='projectDropDown']")
 public WebElement project;
 
 @FindBy(id="//*[@id='ze-main-app']/zee-projects/zee-project/div/div[1]/div[1]/h3/b")
 public WebElement validateproject;
 
 @FindBy(xpath="//*[@id='ze-main-app']/zee-release/zee-release-wrapper/div/div[1]/div[1]/h3/b")
 public WebElement validateRelease;
 
 @FindBy(xpath="//*[@id='ze-main-app']/top-nav/header/div/ul[1]/li[1]/span")
 public WebElement rolemsg;
 
 @FindBy(xpath="//span[contains(.,'Manage Release')]")
 public WebElement manage_Release_Button;
 
 @FindBy(xpath="//i[@class='misc-image user-image']")
 public WebElement user_option;
 
 @FindBy(xpath="//a[contains(.,'Logout')]")
 public WebElement logout;
 
 
	
//@FindBy(xpath="//b[@role='presentation']")
//private WebElement selectReleasedd;
 
 public String role;

 //For Selecting Project
protected String project1="(//*[text()='";
protected String project2="'])[1]";

//For Selecting Release
protected String release1="//*[text()='";
protected String release2="' and @class='zui-link grid_link_click release_name']";





public ProjectPage_POM(WebDriver driver) 
{
  this.driver = driver;
  PageFactory.initElements(LaunchBrowser.driver,this );

}


}
