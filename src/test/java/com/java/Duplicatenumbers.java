package com.java;

public class Duplicatenumbers {

	public static void main(String[] args) {
		int[] str = new int[] {1,2,3,4,3,2,1,4,5,6,6};
		System.out.println("avoid dulpicate number");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
					System.out.println(str[j]);
			}
		}


	}

}
