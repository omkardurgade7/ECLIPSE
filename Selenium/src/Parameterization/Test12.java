package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test12 {
           //get/data from column or cells
        
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream column=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		
	    Sheet hh=WorkbookFactory.create(column).getSheet("Sheet5");
	    
	    int getcell=hh.getLastRowNum();
	    
	    for(int i=0; i<=getcell; i++)
	    {
	    	String names=hh.getRow(i).getCell(0).getStringCellValue();
	        System.out.println(names);	
	    }
	 
	}
}
