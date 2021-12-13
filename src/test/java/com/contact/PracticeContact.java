package com.contact;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclasses;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.Homepage;

public class PracticeContact extends Baseclasses {
	
	@Test

	public void PracticeContact() throws Throwable
	{


		ExcelUtility exl = new ExcelUtility();

		Homepage hp = new Homepage(driver);

		ContactInfopage cp = new ContactInfopage(driver);
		cp.createcont();
		String abc1 =exl.readDatafromExcel(0, 4, "Sheet8");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown(abc1);


		String abc4 = exl.readDatafromExcel(1, 3, "Sheet8");
		String abc5 = exl.readDatafromExcel(1, 2, "Sheet8");
		cnp.lastname().sendKeys(abc4);
		cnp.mobile().sendKeys(abc5);
		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

   		if (contactname.isDisplayed()) {
   			Assert.assertTrue(false);
   		}

   		//logout from app
   				hp.logoutfromApp();



	}
}
