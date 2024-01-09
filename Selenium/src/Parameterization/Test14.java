package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test14 {
       public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	   FileInputStream excel=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
    	   
    	   Sheet testcases=WorkbookFactory.create(excel).getSheet("Sheet7");
    	   
    	   int lastrowindex=testcases.getLastRowNum();
    	   
    	   for(int i=0; i<=lastrowindex; i++)
    	   {
    		   int lastcellindex=testcases.getRow(i).getLastCellNum()-1;
    		   
    		   for(int a=0;  a<=lastcellindex; a++)
    		   {
    			   String value=testcases.getRow(i).getCell(a).getStringCellValue();
    			   System.out.print(value+" ");
    		   }
    		   System.out.println();
    	   }
    	   
    	   
	}
}
