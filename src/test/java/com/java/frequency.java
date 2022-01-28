package com.java;

public class frequency {

	public static void main(String[] args) {
		String s1 = "Sabbari Ratish Sabbari Ratish interview on Software Testing domain ";
		char ch[]  = s1.toCharArray() ;
		for(char i= 0;i<s1.length();i++)
		{
		int count =0;
		for(int j=0;j<ch.length;j++)
			
		{
		if(i==ch[j])		
		{
		count=count+1;
		}
		}

		if(count >0)
		{
		System.out.println(s1 +"-"+ count);
		}

	}

	}
}
