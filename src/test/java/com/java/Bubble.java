package com.java;

public class Bubble {

	public static void main(String[] args) {

		int[] arr= {7,6,11,11,45,36,15,2,2,15};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
				if(arr[i]==arr[j])
				{
					arr[j]=0;
					
				}
				
			}
//			if(arr[i]!=0)
//			{
//				System.out.print(arr[i]);
//			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			System.out.print(arr[i]);
			}		}
		
		
		
		
	}

}
