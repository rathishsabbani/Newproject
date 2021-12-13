package com.Vtiger.Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String readDatafromExcel (int row,int cell,String sheetname) throws  IOException {
		FileInputStream fis = new FileInputStream("../SDET_PROJECT/contact.xlsx");

		Workbook wb=WorkbookFactory.create(fis);

		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();

		return  data;
	}

	
}
