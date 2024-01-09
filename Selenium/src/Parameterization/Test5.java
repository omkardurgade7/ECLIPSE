  package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	
    	FileInputStream excel=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
    	
    	boolean result=WorkbookFactory.create(excel).getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();
    	
    	System.out.println(result);
    	
	}
}
