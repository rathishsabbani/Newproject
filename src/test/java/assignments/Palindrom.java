package assignments;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		boolean flag= true;
		
		Scanner s= new Scanner(System.in );//Convert the givenstring into lowercase
		System.out.println("Enter the first string");
		String str = s.nextLine();
		String string= str.toLowerCase();
		//Iterate the string forward and backward,compare one character at atime
		//till middle of the string is reached

		for(int i=0; i<string.length()/2;i++) {
		if(string.charAt(i)!=string.charAt(string.length()-1)) {
		flag = false;
		break;
		}
		}
		       if(flag)
		      System.out.println("Given string is palindrome");
		       else
		      System.out.println("Given string is not a palindrome");


		}

	}


