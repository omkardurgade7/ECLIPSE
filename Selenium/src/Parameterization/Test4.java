package Parameterization;


import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {
    
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream okok=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		
		double value=WorkbookFactory.create(okok).getSheet("Sheet1").getRow(8).getCell(3).getNumericCellValue();
		
		System.out.println(value);
		
	
	}
}
