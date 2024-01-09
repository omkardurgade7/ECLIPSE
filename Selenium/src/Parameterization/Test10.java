package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test10 {
            
	        //Get or fetch numeric info as a string
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fetch=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		
		String get=WorkbookFactory.create(fetch).getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(get);
	}
}
