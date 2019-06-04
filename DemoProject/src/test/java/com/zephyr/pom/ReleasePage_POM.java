package com.zephyr.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zephyr.common.LaunchBrowser;

public class ReleasePage_POM
{
	WebDriver driver=null;
	
	
	@FindBy(xpath="//*[@id='sidr']//ul/li[2]/a/span[2]")
	public WebElement testRepository;
	
	@FindBy(xpath="//*[@id='ze-main-app']//zee-list-detail-view/div/div[2]/a")
	public WebElement list_Tab;
	
	//@FindBy(xpath="//*[@id='ze-main-app']/zee-test-repository/test-repository-component/div[2]/div[1]/div[1]/h3/b")
	@FindBy(xpath="//*[@id='sidr']//ul/li[2]/a/span[2]")
	public WebElement validateRepository;
	
	//Added
	@FindBy(xpath=".//*[@id='sidr']//ul/li[1]/a/span[2]")//
	 public WebElement requirements;//
	 
	 //@FindBy(xpath=".//*[@id='ze-main-app']/zee-test-requirements/test-requirements-component/div[1]/div[1]/div[1]/h3/b")//
	 @FindBy(xpath=".//*[@id='sidr']//ul/li[1]/a/span[2]")
	 public WebElement validateRequirements;//
	
	public ReleasePage_POM(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(LaunchBrowser.driver,this);
		
	}
}
