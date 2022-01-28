package com.log4j;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	Logger log =Logger.getLogger(Login.class);
	public WebDriver driver;
	
	@BeforeSuite
		public void databaseConnect()
		{
		log.info("connecting to database");
		}
	@BeforeClass
	public void openBrowser()
	{
		log.info("Opening the browser");
	 driver = new ChromeDriver();
	
	}
	
	@Test
	public void login()
	{
		log.info("Login");
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		log.info("close the browser");
	driver.close();	
	}
	@AfterSuite
	public void closeConnection() 
	{
		log.info("close the database connection");
	}
}
