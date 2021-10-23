package com.Vtiger.pomscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclass;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.JavaUtility;

import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.Homepage;

public class Tc_001_CreateContact_Test extends Baseclass
{
	@Test
	public void TC001_CreateContact() throws Throwable
	{

		JavaUtility jv = new JavaUtility();	
		int randomnumber =jv.generateRandomNo();

		String orgname="QSPHYD"+randomnumber;
		System.out.println(orgname);



		ExcelUtility Elib= new ExcelUtility();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		hp=new Homepage(driver);
		hp.getContactslink().click();

		ContactInfopage cip= new ContactInfopage(driver);
		cip.createcont();  

		//selecting the dropdown
		String abc1 = Elib.readDatafromExcel(0, 4, "Sheet8");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown(abc1);

		String abc2=Elib.readDatafromExcel(3, 0, "Sheet8");
		cnp.firstname().sendKeys(abc2);


		//Entering the last name
		String abc4 = Elib.readDatafromExcel(1, 1, "Sheet8");
		cnp.lastname().sendKeys(abc4);

		cnp.getSavecontbtn().click();

		//Again clicking on Contacts
		hp.getContactslink().click();		
		//sending data in text boz
		cip.contactname().sendKeys(abc4);

		String abc3 = Elib.readDatafromExcel(0, 6, "Sheet8");
		cip.selectdropdown(abc3);
		
        
		cip.submit();

		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

		if (contactname.isDisplayed()) {
			Assert.assertTrue(true);
		}


	}

}
