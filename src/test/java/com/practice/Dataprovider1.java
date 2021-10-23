package com.practice;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1
{

	@Test(dataProvider="bookTicketDataProvider")
	public void bookTicket(String src, String dest, int ticket)
	{
		System.out.println("source =>" +src+ ",Destination=>"+dest);
	}
	
	
	@DataProvider
	public Object[][] bookTicketDataProvider()
	{
		
		Object[][] objArr= new Object[3][3];
		objArr[0][0]="Hyderabad";
		objArr[0][1]="Chennai";
		objArr[0][2]=20;
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Mysore";
		objArr[1][2]=0;
				
		objArr[2][0]="Hyderabad";
		objArr[2][1]="Pune";
		objArr[2][2]=20;
		return objArr;
		
	}

	
	

}
