package com.javapractice;


 class Samples implements Runnable
 
 {
	public void run() {
		for(int i=1;i<3;i++)
		{
			System.out.println("sample implements");
		}
	}
 }
 class Demos implements Runnable
 {
	 public void run() {
		 for(int i=1;i<3;i++)
			{
				System.out.println("sample2");
			}
		 
	 }
 }
 public class Implementation {
	public static void main(String[] args) {
		
  Sample s1 = new Sample();
  Thread  t1 =new Thread(s1);
  Demo d1=new Demo();
  Thread  t2 =new Thread(d1);
  t1.start();
  t2.start();
	
 for(int i=1;i<3;i++)
	{
		System.out.println("sample implement");
	}
 
	}
 }
