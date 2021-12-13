package com.contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclasses;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.Homepage;
@Listeners(com.Vtiger.Generic.ListenersImplementations.class)
public class Tc_001CreateContact_Test extends Baseclasses {
	
		@Test
		public void Tc001_CreateContactwithEmail() throws Throwable
		{

	       ExcelUtility Elib = new ExcelUtility();
			Homepage hp = new Homepage(driver);
			
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
		   			Assert.assertTrue(false);
		   		}

		   		//logout from app
		   				hp.logoutfromApp();

		       
		   				
			
		}

}
