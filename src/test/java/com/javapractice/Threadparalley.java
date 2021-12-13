package com.javapractice;


class Sample extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("This is my thread");
		}
	}
}
class Demo extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("This is 3 thread");
		}
	}
}

public class Threadparalley {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.start();
		Demo s2 = new Demo();
		s2.start();
		for(int i=1;i<=3;i++)
		{
			System.out.println("This is main thread");
		}

	}

}
