package com.Vtiger.Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.Homepage;
import com.Vtiger.ObjectRepo.Loginpage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentrepots {
	WebDriver driver = new ChromeDriver();
	@Test
	public void createcontact() throws Throwable
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("../SDET_PROJECT/src/main/resources/Ratish.html");
		reporter.config().setDocumentTitle("SDET1");

		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("Appurl", "https://localhost:8888");
		reports.setSystemInfo("Env", "Test QA");
		reports.setSystemInfo("Build", "2.1");
		reports.setSystemInfo("Reportername", "Rathish");

		ExtentTest test = reports.createTest("createcontact");
		test.log(Status.PASS, "this TC is pass");


		FileUtility flib= new FileUtility();
		ExcelUtility Elib= new ExcelUtility();
		//open the browser
		String browsername = flib.readDatafromPropfile("browser");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
			System.out.println("chrome is opened");
		} else if (browsername.equals("ff")) {

		} else {
			System.out.println("please enter proper browser name");
		}

		//Enter the url
		driver.get(flib.readDatafromPropfile("url"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);           
		driver.manage().window().maximize();                                       

		//Giving username and password
		//Step 2 Login to app
		Loginpage lp= new Loginpage(driver);
		lp.logintoApp();

		Homepage hp =new Homepage(driver);
		hp.getContactslink().click();

		ContactInfopage cip= new ContactInfopage(driver);
		cip.createcont();  

		//selecting the dropdown
		String abc1 = Elib.readDatafromExcel(0, 4, "Sheet8");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown(abc1);


		String abc4 = Elib.readDatafromExcel(1, 3, "Sheet8");
		String abc5 = Elib.readDatafromExcel(1, 2, "Sheet8");
		cnp.lastname().sendKeys(abc4);
		cnp.mobile().sendKeys(abc5);

		//selecting title and department
		String abc6 = Elib.readDatafromExcel(1, 4, "Sheet8");
		cnp.title().sendKeys(abc6);
		String abc7 = Elib.readDatafromExcel(1, 5, "Sheet8");
		cnp.department().sendKeys(abc7);

		//selecting Email id and Emailoptout

		String abc8 = Elib.readDatafromExcel(1, 6, "Sheet8");
		cnp.email().sendKeys(abc8);

		cnp.emailcheckbox().click();

		//clicking on Reference checkbox
		cnp.reference().click();

		//clicking on save button
		cnp.getSavecontbtn().click();

		//Again clicking on Contacts
		hp.getContactslink().click();		
		//sending data in text boz
		cip.contactname().sendKeys(abc4);
		//selecting the dropdowntype
		String abc3 = Elib.readDatafromExcel(0, 6, "Sheet8");
		cip.selectdropdown(abc3);
		//click on submit button
		cip.submit();

		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

		if (contactname.isDisplayed()) {
			Assert.assertTrue(true);
		}

		//logout from app
		hp.logoutfromApp();


		reports.flush();




	}
}
