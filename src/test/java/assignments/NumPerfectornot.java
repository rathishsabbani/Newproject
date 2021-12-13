package assignments;

import java.util.Scanner;

public class NumPerfectornot {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any interger");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("given number is perfect");
		}
		else
		{
			System.out.println("given number is not perfect");
		}
		

	}

}

/* output:
 Enter any interger
28
given number is perfect
*/
