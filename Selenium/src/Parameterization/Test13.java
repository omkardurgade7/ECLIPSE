package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test13 {
      
	
	
	  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	  FileInputStream data=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
	  
	  Sheet fetch=WorkbookFactory.create(data).getSheet("Sheet6");
	  
	  int rowindex=fetch.getLastRowNum();
	  
	  //outer for loop for columns
	  for(int i=0; i<=rowindex; i++)
	  {
		  int columnindex=fetch.getRow(i).getLastCellNum()-1;
		 
		  //inner for loop for column
		  for(int s=0; s<=columnindex; s++)
		  {
		String s1=fetch.getRow(i).getCell(s).getStringCellValue();
		System.out.print(s1+" ");
	  }
		  System.out.println();
	  }
		  
}

	}
