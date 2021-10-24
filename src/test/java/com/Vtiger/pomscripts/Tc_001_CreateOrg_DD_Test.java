package com.Vtiger.pomscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclasses;
import com.Vtiger.Generic.JavaUtility;
import com.Vtiger.Generic.WebDriverUtility;
import com.Vtiger.ObjectRepo.CreateNewOrg;
import com.Vtiger.ObjectRepo.Homepage;
import com.Vtiger.ObjectRepo.OrgInfoPage;

public class Tc_001_CreateOrg_DD_Test extends Baseclasses
{

	@Test
	public void Tc001_CreateOrgDDTest() throws Throwable
	{
		JavaUtility jv = new JavaUtility();	
		int randomnumber =jv.generateRandomNo();

		String orgname="QSPHYD"+randomnumber;
		System.out.println(orgname);


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		//step 3 click on org link
		hp = new Homepage(driver);
		hp.getOrglink().click();

		//step 4 click on + btn
		OrgInfoPage oip= new OrgInfoPage(driver);
		oip.createorg();


		//Step 5 Fill the details and select value from DD
		// organaization name
		CreateNewOrg cno= new CreateNewOrg(driver);
		cno.getOrgname().sendKeys(orgname);

		cno.getIndustry("Education");

		WebDriverUtility webulity = new WebDriverUtility();
		WebElement ratingDropdown=driver.findElement(By.name("rating"));
		webulity.selectelementfromDropdown(ratingDropdown, "Active");


		WebElement typeDropdown=driver.findElement(By.name("accounttype"));
		webulity.selectelementfromDropdown(typeDropdown, 3);

		cno.getSaveorgbtn().click();

		Thread.sleep(3000);

		//Click on org link
		hp.getOrglink().click();
		//sending data in text box
		oip.orgname().sendKeys(orgname);

		//clicking on dropdown and selecting organization name
		oip.selectdropdown("Organization Name");

		//click on submit button
		oip.submit();

		WebElement actualelement=driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']"));

		System.out.println(actualelement.isDisplayed());

		AssertJUnit.assertEquals(actualelement.isDisplayed(), true);






	}
}
