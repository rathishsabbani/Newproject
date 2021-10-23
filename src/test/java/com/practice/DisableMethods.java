package com.practice;


import org.testng.annotations.Test;

public class DisableMethods 
{
    @Test
	public void priority1()
	{
		System.out.println("Method 1");
	}
	@Test(dependsOnMethods="priority1")
	public void priority2()
	{
		System.out.println("Method 2");
	}
	@Test(enabled=false,alwaysRun=true)
	public void priority3()
	{
		System.out.println("Method 3");
	}
	

}
