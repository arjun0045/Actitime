package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * This is a generic class for data driven testing 
 * @author Arjun
 *
 */
public class FileLib 
{
	/**
	 * This is a generic method for reading the data from property file
	 * @param key
	 * @param string
	 * @return 
	 * @throws IOException 
	 * @throws IO Exception
	 */

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");	
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

/**
 *This is a generic method for reading the from data from the Excel file
 *@param sheetName
 *@param Row
 *@param Cell
 *@return
 * @throws IOException 
 * @throws EncryptedDocumentException 
 */
public String getExcelData(String SheetName,int Row, int Cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
	return data;
	
}
/**
 *This is a generic method for writing the data in the Excel file
 *@param sheetName
 *@param Row
 *@param Cell
 *@throws IOException 
 * @throws EncryptedDocumentException 
 */
public void setExcelData(String SheetName,int Row, int Cell, String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 wb.getSheet(SheetName).getRow(Row).getCell(Cell).setCellValue(value);
	 FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	 wb.write(fos);
	 wb.close();
	 System.out.println(value+" has been sucessfully returned in excelfile");
	
}
}



















