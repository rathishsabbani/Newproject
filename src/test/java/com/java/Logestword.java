package com.java;

public class Logestword {

	public static void main(String[] args) {
		String s1 = "good afternoon to all";
		String[] str = s1.split(" ");
		
		int maxlength = 0;
		String word = "";
		for(int i=0;i<str.length;i++)
		{
			if(maxlength<str[i].length())
			{
				maxlength = str[i].length();
				word = str[i];
				
			}
			
		}
		System.out.println(maxlength+" "+word);
	}

}
