package com.java;

import java.util.Scanner;

public class SumofallEvenIndex {

	public static void main(String[] args) {

		{
			int temp = 0, temp1=0;
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the Array size");
			int n=s.nextInt();
			System.out.println("Enter array Elements:");
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}

			for(int j=0;j<n;j++)
			{
				if(a[j]%2==0)
				{
					temp=temp+a[j];
				}

				else
				{
					temp1=temp1+a[j];
				}
			}


			System.out.println("Even elements after adding:"+temp);
			System.out.println("Odd elements after adding:" +temp1);
		}

	}

}
