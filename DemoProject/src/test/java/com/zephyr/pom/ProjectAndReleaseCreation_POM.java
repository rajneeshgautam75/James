package com.zephyr.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndReleaseCreation_POM {

	
	
	@FindBy(xpath="//*[text()='Administration']")
	public WebElement administration;
	
	
	
	@FindBy(xpath="//span[text()='Manage Projects']")
	public WebElement manageProjects;
	
	@FindBy(xpath="//*[@title='Add project']")
	public WebElement addProject;
	
	@FindBy(xpath="//*[@id='project-name']")
	public WebElement projectName;
	
	
	@FindBy(xpath="(//*[@class='form-control ng-pristine ng-valid ng-touched'])[1]")
	public WebElement mapExternalProject;
	
	@FindBy(xpath="(//*[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
	public WebElement selectLead;
	
	
	@FindBy(xpath="//*[@href='#isolationLevel-modal']")
	public WebElement projectType;
	
	
	@FindBy(xpath="//*[@id='project-description']")
	public WebElement projectDesc;
	
	
	
	
	
	@FindBy(xpath="//span[@class='forward-image']")
	public WebElement forwardImage;
	
	
	@FindBy(xpath="//*[@id='ze-main-app']//div/button[2]")
	public WebElement submitButton;
	
	
	public String resourceAllocation1="//label[text()='";
	public String resourceAllocation2="']";
	//*[@href='#isolationLevel-modal']
	
	
	
	
	///Release creation 
	
	@FindBy(xpath="//*[@title='Add New Release']")
	public WebElement addRelease;
	
	@FindBy(xpath="//span[text()='Create new release']")
	public WebElement createNewReleaseOption;
	
	@FindBy(xpath="//*[@name='name']")
	public WebElement releaseName;
	
//	@FindBy(xpath="//*[@title='Add New Release']")
//	public WebElement addRelease;
//	
//	@FindBy(xpath="//*[@title='Add New Release']")
//	public WebElement addRelease;
	
	
	
}
