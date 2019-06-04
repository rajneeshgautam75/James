package com.zephyr.reusablemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ReleaseSetupPage 
{
	WebDriver driver;
  
	@FindBy(xpath="(//*[@class='fa fa-calendar'])[1]")
	public WebElement release_Calender;
	
	public ReleaseSetupPage(WebDriver driver) 
	{
		
		this.driver = driver;
		
	}
	
	
//	        [FindsBy(How =How.ClassName, Using = "ui-datepicker-calendar")]
//		    public IWebElement tblCalendar;
//
//		    
//	        //[FindsBy(How = How.XPath, Using = "//a[@title=\"Prev\"]")]
//		    @FindBy(xpath=".//*[@id='release-startdate']/calendar/div/div/div/datepicker/datepicker-inner/div/daypicker/table/thead/tr[1]/th[1]/button")
//	        public IWebElement btnPrevious;
//
//		    [FindsBy(How = How.XPath, Using = "//a[@title=\"Next\"]")]
//		    @FindBy(xpath=".//*[@id='release-startdate']/calendar/div/div/div/datepicker/datepicker-inner/div/daypicker/table/thead/tr[1]/th[3]/button")
//		    public IWebElement btnNext;
//
//		    [FindsBy(How = How.ClassName, Using = "ui-datepicker-year")]
//		    public IWebElement lblYear;
//
//		    [FindsBy(How = How.ClassName, Using = "ui-datepicker-month")]
//		    public IWebElement lblMonth;

		    
		    


		    public void SelectDateFromDatePicker(String year, String month, String date) throws InterruptedException
		    {

		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//*[text()='Manage Release']")).click();
		    	driver.findElement(By.xpath("//span[@title='Add New Release']")).click();
		    	
		        Thread.sleep(4000);
		    	driver.findElement(By.xpath("//*[@class='zui-btn zui-btn-primary' and text()='Continue']")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("(//*[@class='fa fa-calendar'])[1]")).click();
		    	
		    	
		    	Actions a2=new Actions(driver);
		    	
		    	a2.sendKeys(Keys.DOWN).perform();
		    	a2.sendKeys(Keys.DOWN).perform();
		    	a2.sendKeys(Keys.DOWN).perform();
		    	a2.sendKeys(Keys.DOWN).perform();
		    	
		    	
		    	
		    	
		    	
		    	Thread.sleep(3000);
		    	WebElement selectdate=driver.findElement(By.xpath("(//*[@class='btn btn-default btn-secondary btn-sm'])[1]"));
		    	Actions a1=new Actions(driver);
		    	a1.moveToElement(selectdate).doubleClick().perform();
		    	
		    	
		    	
		    	Select s1=new Select(selectdate);
	        	s1.selectByVisibleText(year);
	        	Thread.sleep(3000);
	        	
	        	//WebElement elemonth=driver.findElement(By.x)
		        s1.selectByVisibleText(month);
		        Thread.sleep(2000);
		        s1.selectByVisibleText(date);
	        	
//	          Thread.sleep(1000);
//              new Select(driver.findElement(By.cssSelector("select.ui-datepicker-month"))).selectByVisibleText(date[1]);
//              Thread.sleep(1000);
//    
//              new Select(driver.findElement(By.xpath(xpathExpression))).selectByVisibleText(date);
//              //driver.findElement(By.linkText(date[2])).click();
//              Thread.sleep(1000);
//	        	
//	        	
//	        	while (year != lblYear.Text)
//		        {
//		        	Select s1=new Select(ele);
//		        	s1.selectByVisibleText(year);
//		        	
//		        	
//		            if (int.Parse(year) < int.Parse(lblYear.Text))
//		            {
//		                btnPrevious.Clicks();
//		            }
//		            else
//		            {
//		                btnNext.Clicks();
//		            }
//		        }
//
//		        while (lblMonth.Text != "January")
//		        {
//		            btnPrevious.Clicks();
//		        }
//
//		        while (month != lblMonth.Text)
//		        {
//		               btnNext.Clicks();
//		        }
//
//		        IWebElement dateField = PropertiesCollection.driver.FindElement(By.XPath("//a[text()=\""+ date+"\"]"));
//		        dateField.Clicks();
		    }
	

}
