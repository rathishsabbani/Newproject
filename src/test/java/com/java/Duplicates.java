package com.java;

public class Duplicates {

	public static void main(String[] args) {
		String str = "Dammannapeta";
		String dup = " ";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(dup.indexOf(ch)==-1)
			{
				dup=dup+ch;
			}
		}
		System.out.println(dup);

	}
	

}
