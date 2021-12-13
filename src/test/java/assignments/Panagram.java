package assignments;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();

		// replaceALL()-->replaces all spaces between strings
		//toLowerCase()->method which converts all characters to lower case
		str=str.toLowerCase();

		// empty string
		String s="";

		// checking characters (a-z or A-Z)
		for(char i='a';i<='z';i++){
			//indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
			if(str.indexOf(i)!=-1)
			{
				s=s+i;// empty string+character
			}
		}
		// s.length()-->this method returns number or character of a string
		if(s.length()==26){
			System.out.println("Pangram"+s);
		}
		else{
			System.out.println(" Not Pangram");

	}

}
}