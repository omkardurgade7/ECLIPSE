package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
     
	//fetch data from excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//to go/reach out excel sheet
		FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		
		String t1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(t1);
	}
}
