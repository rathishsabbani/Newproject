package assignments;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		int n,i;
		int a,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUES");
		n= sc.nextInt();
		int backup =n;
		int total =0;
		
		while(n!=0)
		{
			i=1;
			a=1;
			lastdig=n%10;
			while(i<=lastdig)
			{
				a=a*i;
				i++;
				
			}
			total=total+a;
			n= n /10;
		}
		if(total==backup)
		{
			System.out.println(backup+"is a strong no");
		}
		else
		{
			System.out.println(backup+"is not a strong no");
		
		System.out.println();
		

	}
	}
}
