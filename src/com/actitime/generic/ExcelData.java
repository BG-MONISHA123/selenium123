package com.actitime.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData
{
	public static String getData(String filepath,String sheetname,int rn,int cn)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filepath);
			@SuppressWarnings("unused")
			Cell c = WorkbookFactory.create(fis).getSheet(sheetname).getRow(rn).getCell(cn);
			return " " ;
			
		}
		catch(Exception e)
		{
			return " ";
		}
	}
}
	
