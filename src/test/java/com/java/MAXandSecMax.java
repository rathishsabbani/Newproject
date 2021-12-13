package com.java;

import java.util.Scanner;

public class MAXandSecMax {

	public static void main(String[] args) {
		{
			int max, size, i, secmax;

			Scanner scan = new Scanner(System.in);


			System.out.println("Enter array Size : ");
			size = scan.nextInt();
			int numArr[] = new int[size];

			System.out.println("Enter array elements : ");
			for(i=0; i<size; i++){
				numArr[i] = scan.nextInt();
			}

			System.out.print("Searching for the Maximum Element....\n\n");

			max = numArr[0];
			secmax=numArr[0];
			for(i=0; i<size; i++){ 
				if(max < numArr[i])
				{
					secmax=max;
					max = numArr[i];

				}
				else
					if(max>numArr[i])
					{
						secmax=numArr[i];
					}


			}

			System.out.print("Largest Element = " + max);
			System.out.println("Second Largest Element:" + secmax);


		}

	}


}

