package assignments;

import java.util.Scanner;

public class PrimenumberScann {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int num=sc.nextInt();                          //list of prime numbers
		System.out.println("enter the last value");
		int num1=sc.nextInt();

		for(int i=num;i<=num1;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
				if(i%j==0)
				{
					count++;

				}
		
		if(count==2)
		{
			System.out.println(i+"is a prime number");
		}
//		else
//		{
//			System.out.println(i+"is not a prime number");
//		}

	}
}
}

/* output:
enter the values
50
enter the last value
68
53is a prime number
59is a prime number
61is a prime number
67is a prime number
*/

