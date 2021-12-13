package com.javapractice;

public class Throw {

		public static void Validate (int age)
		{
			if(age<18)
			{
			throw new ArithmeticException("u r not eligible");
		}
		else
		{
			System.out.println("u can vote");
		}

	}
	public static void main(String[] args)
	{
		Validate(17);
	}
}
