package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream storage=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		
		String k1=WorkbookFactory.create(storage).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(k1);
		
	
	}
}
