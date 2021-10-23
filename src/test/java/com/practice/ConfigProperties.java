package com.practice;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis= new FileInputStream("..\\SDET_PROJECT\\Commond.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String propvalue=prop.getProperty("userName");
		System.out.println(propvalue);

	}
	

}
