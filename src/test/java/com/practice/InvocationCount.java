package com.practice;

	import org.testng.annotations.Test;

	public class InvocationCount 
	{
	    @Test(invocationCount=-1)
		public void priority1()
		{
			System.out.println("Method 1");
		}
		@Test(invocationCount=2)
		public void priority2()
		{
			System.out.println("Method 2");
		}
		@Test(invocationCount=5)
		public void priority3()
		{
			System.out.println("Method 3");
		}

}
