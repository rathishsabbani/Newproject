  package com.Vtiger.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Vtiger.ObjectRepo.Homepage;
import com.Vtiger.ObjectRepo.Loginpage;


public class Baseclasses {
	public WebDriver driver;
	public FileUtility fileutility = new FileUtility();
	public Homepage hp;
	public static WebDriver staticdriver;
	
	@BeforeSuite(groups={"smoke","sanity","regression"})
	public void startconnection()
	{
		System.out.println("Started the connection with Database");
	}
	
	@AfterSuite(groups={"smoke","sanity","regression"})
	public void closeconnection()
	{
		System.out.println("Close the Database Connection");
	}
	
	// @Parameters("browser")
	
    @BeforeClass(groups={"smoke","sanity","regression"})
    public void launchbrowser() throws Throwable
    {
    String browsername=fileutility.readDatafromPropfile("browser");
    	if
    	(browsername.equals("chrome"))
    	{
    		driver = new ChromeDriver();
    	}
    	else if
    	(browsername.equalsIgnoreCase("Firefox"))
    	{
    		
    		driver = new FirefoxDriver();
    	}
    	else if
    	(browsername.equalsIgnoreCase("safari"))
    	{
    		driver = new SafariDriver();
    	}
    	staticdriver=driver;
    	driver.get(fileutility.readDatafromPropfile("url"));
    	driver.manage().window().maximize();
    }
	
	
    @BeforeMethod(groups={"smoke","sanity","regression"})
    public void logindetails() throws Throwable
    {
    	Loginpage lp= new Loginpage(driver);
    	lp.logintoApp();
    }
    
    
    @AfterMethod(groups={"smoke","sanity","regression"})
    public void logout()
    {
    	hp = new Homepage(driver);
    	hp.logoutfromApp();
    }
    
    
	@AfterClass(groups={"smoke","sanity","regression"})
	public void closebrowser()
	{
		driver.close();
		
	}
	
	public static String getscreenshot(String name) throws IOException
	{
		File srcfile = ((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		
	  String destfile= System.getProperty("user.dir")+"/screen/"+name+".png";
	
	  File finaldest=new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;
	  }

}
