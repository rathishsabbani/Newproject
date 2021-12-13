package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in );
		System.out.println("Enter the first string");
		String s1=s.nextLine();
		Scanner s3= new Scanner(System.in );
		System.out.println("Enter the second string");
		String s2=s3.nextLine();
//		String s1="madam";
//		String s2="maadM";  
	   String a=s1.toLowerCase();
	   String b= s2.toLowerCase();
		if(a.length()==b.length())
		{
		char[] ch=a.toCharArray();
		char[] ch1=b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1)==true)
		 {
			System.out.println("Both the strings are Anagram");
		  }
		
		else
		{
			System.out.println("Not a anagram");
		}
		
		}	
		
		
		else
		{
			System.out.println("Not a anagram");
		}
		
		

	}

	}

