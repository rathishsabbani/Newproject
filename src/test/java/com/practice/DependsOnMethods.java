package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test()
	public void priority1()
	{
		System.out.println("Method 1");
	}
	@Test(dependsOnMethods="priority1")
	public void priority2()
	{
		Assert.fail();
		System.out.println("Method 2");
	}
	@Test(dependsOnMethods="priority2",alwaysRun=true)
	public void priority3()
	{
		System.out.println("Method 3");
	}

}
