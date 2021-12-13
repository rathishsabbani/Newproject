package com.java;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldataprgm {

		public static void main(String[] args) throws Throwable {
			
		
		FileInputStream fis = new FileInputStream("../SDET_PROJECT/contact.xlsx");

		Workbook wb=WorkbookFactory.create(fis);

		int value = wb.getSheet("sheet9").getLastRowNum();
		for(int i =1;i<value;i++)
		{
		int sal = (int) wb.getSheet("sheet9").getRow(i).getCell(2).getNumericCellValue();
		if(sal>48000)
		{
			System.out.println(wb.getSheet("sheet9").getRow(i).getCell(1)+" "+sal);
			
		}
}
}
}
