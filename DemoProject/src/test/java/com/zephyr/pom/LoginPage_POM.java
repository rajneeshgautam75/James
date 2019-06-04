package com.zephyr.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zephyr.common.LaunchBrowser;

public class LoginPage_POM
{	
	WebDriver driver=null;
	
	
	@FindBy(id="ap_email")
//@FindBy(xpath="(//*[@id='zee-login-username'])[2]")
public WebElement username;

@FindBy(id="ap_password")
//@FindBy(xpath="(//*[@id='zee-login-password'])[2]")
 public WebElement password;
    
@FindBy(id="signInSubmit")
//@FindBy(xpath="(//button[text()='Login'])[2]")
public WebElement loginButton;

@FindBy(id="continue")
//@FindBy(xpath="(//*[@id='zee-login-password'])[2]")
public WebElement continueButton;

public String role;


public LoginPage_POM(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(LaunchBrowser.driver, this);
	
}


}
