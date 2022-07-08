package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	File src;
	FileInputStream FRead;
	FileOutputStream FWrite;
	XSSFWorkbook workBook;
	XSSFSheet sheet;

	public ExcelSheet() {

		try 
		{
			this.src = new File("C:\\Users\\sdevane\\Documents\\AsianPaintsDataExcel.xlsx");
			this.FRead = new FileInputStream(src);
			this.workBook = new XSSFWorkbook(FRead);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetName, int row, int column)
	{
		sheet = workBook.getSheetAt(sheetName);
		String data;
		data = sheet.getRow(row).getCell(column).getStringCellValue();
		System.out.println(data);
		return data;
	}
}
