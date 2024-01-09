package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {

	          //Find last row index
	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
	    	
	    	FileInputStream sheet=new FileInputStream("D:\\\\Selenium Excel Sheet\\\\Parameterization Excel sheet.xlsx");
	    	
	    	int num=WorkbookFactory.create(sheet).getSheet("Sheet1").getLastRowNum();
	    	
	    	System.out.println(num);
	    	
	       
}
}
