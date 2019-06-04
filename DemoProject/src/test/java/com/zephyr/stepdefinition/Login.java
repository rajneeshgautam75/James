package com.zephyr.stepdefinition;

import org.openqa.selenium.By;

import com.zephyr.common.LaunchBrowser;
import com.zephyr.generic.Property_Lib;
import com.zephyr.reusablemethods.BasePage;
import com.zephyr.reusablemethods.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends LaunchBrowser
{
	LaunchBrowser lb;
	LoginPage lp;
	BasePage bp;


@Given("^User Selects the Browser, Launches it and Maximises it$")
public void user_Selects_the_Browser_Launches_it_and_Maximises_it() throws Throwable {
	lb=new LaunchBrowser();
	   lb.preCond();

}

@When("^User Navigates to the URL provided$")
public void user_Navigates_to_the_URL_provided() throws Throwable {
    lb=new LaunchBrowser();
    String url=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"URL");
    lb.getUrl(url);
    Thread.sleep(5000);
}

@When("^User Enters Username, Password and clicks on login$")
public void user_Enters_Username_Password_and_clicks_on_login() throws Throwable {
	lp=new LoginPage(driver);
	String Uname=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"Lead_Username_4");
	String Pass=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"Lead_Password_4");
	
	driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]")).click();
	
	
//	lp.enterUname(Uname);
//	lp.enterPass(Pass);
//	lp.clickOnLogin();
	
	lp.enterUnameAndPassword(Uname, Pass);
	System.out.println(Uname);

}

@Then("^User should be Logged in into Zephyr Successfully$")
public void user_should_be_Logged_in_into_Zephyr_Successfully() throws Throwable {
	lp.verifyLoginTitle();
	bp=new BasePage();
	bp.waitForElement();
	bp.waitForElement();
	
	log.info("Pass- User successfully logged into appplication");
    //log.info("Pass - User should be Logged in into Zephyr Successfully");
}

}



