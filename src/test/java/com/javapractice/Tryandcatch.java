package com.javapractice;

public class Tryandcatch {

	public static void main(String[] args) {
		int a=10,b=20,c;
		System.out.println("try");
		try {
			System.out.println("try satrts");
			c=a/b;
			System.out.println("try ends");
		}
		catch(Exception e)
		{
			System.out.println("this is catch block");
			System.out.println(e.toString());
		}
      finally
      {
		System.out.println("main ends");
	}
	}
}
