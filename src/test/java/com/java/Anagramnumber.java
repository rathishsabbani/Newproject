package com.java;

import java.util.Arrays;

public class Anagramnumber {


	public static void main(String[] args) {
		String s1 = "srathish";
		String s2 = "rathsis";
		if(s1.length()==s2.length());
		{
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)==true)
			{
				System.out.println("Both strings are anagrams");
			}
			else
			{
				System.out.println("not anagram number");
			}
		}
	
		{
			System.out.println("not anagrams");
		}
	}

}
