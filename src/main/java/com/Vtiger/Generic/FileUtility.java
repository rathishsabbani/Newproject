package com.Vtiger.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * This Method will read the the data from prop file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDatafromPropfile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream("..\\SDET_PROJECT\\Commond.properties");

		Properties prop = new Properties();
		prop.load(fis);

		return prop.getProperty(key);
	}

}
