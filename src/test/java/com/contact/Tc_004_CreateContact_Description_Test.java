package com.contact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.FileUtility;
import com.Vtiger.Generic.WebDriverUtility;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.Homepage;
import com.Vtiger.ObjectRepo.Loginpage;

public class Tc_004_CreateContact_Description_Test {
	
	WebDriver driver;
	@Test
	public void Tc004_CreateContactwithDescription() throws Throwable
	{
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
		
		
		//selecting first name in dropdown
				String c1 = Elib.readDatafromExcel(4, 0, "Sheet8");
				CreateNewContactPage cnp= new CreateNewContactPage(driver);
				cnp.firstdropdown(c1);
				
				//Entering the lastname
				String c2 = Elib.readDatafromExcel(4, 1, "Sheet8");
				cnp.lastname().sendKeys(c2);
		
				//clicking the dropdown of leadsource
				String c3 = Elib.readDatafromExcel(4, 2, "Sheet8");
				cnp.seconddropdown(c3);
		        //Entering fax id
				String c4 = Elib.readDatafromExcel(4, 3, "Sheet8");
	         	cnp.fax().sendKeys(c4);
		
               // clicking on checkbox reference
	         	cnp.reference().click();
	         	
	         	//clicking on checkbox of notify owner
	         	cnp.notifyowner().click();
	         	
	         	//scrolldown
	         	WebElement element= cnp.portal();
				Point loc= element.getLocation();
				WebDriverUtility wutil= new WebDriverUtility();
				wutil.scrolldown(driver, loc);
		      
				
				//Entering data in Description
				String c5 = Elib.readDatafromExcel(4, 4, "Sheet8");
		        cnp.detailedview().sendKeys(c5);
		
		      //clicking on save button
		           cnp.getSavecontbtn().click();
		   		//Again clicking on Contacts
		   		 hp.getContactslink().click();		
		   	//sending data in text boz
		   		 cip.contactname().sendKeys(c2);
			
				
				
				//selecting value from dropdown
				String abc3 = Elib.readDatafromExcel(0, 6, "Sheet8");
				cip.selectdropdown(abc3);
		          //click on submit button
			   	    cip.submit();
			WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + c2+ "']"));

			if (contactname.isDisplayed()) 
			{
				Assert.assertTrue(true);
				}
		        driver.close();
			
	}

}
