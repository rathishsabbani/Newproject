package com.java;

import java.util.Scanner;

public class MinandSecminimun {

	public static void main(String[] args) {
		{


			Scanner scan = new Scanner(System.in);
			System.out.print("Enter array Size : ");
			int size = scan.nextInt();
			int numArr[] = new int[size];



			System.out.print("Enter array elements : ");
			for(int i=0; i<size; i++){
				numArr[i] = scan.nextInt();
			}

			System.out.print("Searching for the Smallest Element....\n\n");

			int sml = numArr[0];
			int secondsml= numArr[0];
			for(int i=0; i<size; i++)
			{ 
				if(sml > numArr[i])
				{
					secondsml=sml;
					sml = numArr[i];
				}

				else
					if(sml<numArr[i])
					{
						secondsml=numArr[i]; 		   
					}


			}

			System.out.println("Smallest Element = " + sml);
			System.out.println("Second smallest is:"+secondsml);

		}


	}

}
