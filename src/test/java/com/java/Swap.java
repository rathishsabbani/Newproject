package com.java;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before swapping:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afterswapping:"+a+" "+b);
		
	}

}
