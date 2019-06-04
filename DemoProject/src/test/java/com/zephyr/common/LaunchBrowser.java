package com.zephyr.common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.zephyr.generic.Property_Lib;
import com.zephyr.reusablemethods.ProjectPage;






public class LaunchBrowser implements AutomationConstants
{
 public static WebDriver driver;
public static long timeout;
//public static String url;
ProjectPage pp;
//public static String browserType;

public Logger log;

public LaunchBrowser()
{
  log=Logger.getLogger(this.getClass());
  Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
  BasicConfigurator.configure();
}



 public boolean preCond() throws Exception
  {
	 try
	 {
	log.info("Initialising Framework");
	String browserType=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"Browser");
	String url=Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"URL");
	timeout=Long.parseLong((Property_Lib.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"IMPLICIT")));
	
	
	log.info("Browser:"+browserType);
	if(browserType.equalsIgnoreCase("chromeBrowser"))
	{
		//System.setProperty(CHROME_KEY,"C:/Users/RAJNEESH/Desktop/chrome/chrome.exe");
		
		System.setProperty(CHROME_KEY,DRIVER_PATH+CHROME_FILE);
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		option.addArguments("disable-infobars");
		driver = new ChromeDriver(option);
		//driver=new ChromeDriver();
	}
	else if(browserType.equalsIgnoreCase("ieBrowser"))
	{
		
//		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		  
//		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
//		 capabilities.setCapability(InternetExplorerDriver.
//		   INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		System.setProperty("webdriver.ie.driver",DRIVER_PATH+IE_FILE);
		driver=new InternetExplorerDriver();
		
	}
	else
	{
		System.setProperty(GECKO_KEY,DRIVER_PATH+GECKO_FILE);
		driver=new FirefoxDriver();
	}

    driver.manage().window().maximize();
    log.info("TimeOut:"+timeout);
     //System.out.println("TimeOut:"+timeout);
    driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
   // driver.get(url);

    return true;
	 }
	 catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
     //log.info(url);s


}
 
 public void getUrl(String url)
 {
	 driver.get(url);
	 
 }
 
 
// @After
// public void tearDown(Scenario scenario) throws Exception
// {
//	 pp=new ProjectPage(driver);
//	 
// if (scenario.isFailed()) 
// {
//          final byte[] screenshot = ((TakesScreenshot) driver)
//                      .getScreenshotAs(OutputType.BYTES);
//         scenario.embed(screenshot, "image/png"); //stick it in the report
//          
//  }
// 
// 
// try 
// {
//	pp.clickOnLogout();
//   
//}
// catch (InterruptedException e) 
// {
//	//e.printStackTrace();
//}
// 
//}

  public void close()
{
  log.info("Finalising Frmework");
	driver.quit();
}

}