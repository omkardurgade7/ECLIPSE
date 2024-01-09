package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test11 {
        
	            //Get/Fetch data of a row
	  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream fetch=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		  
		  //Create object and store sheet and give sheet return 
		  Sheet data=WorkbookFactory.create(fetch).getSheet("Sheet4");
		  
		  //create a object of int returntype and call the methods for getting indexes 
		  int lastindex=data.getRow(0).getLastCellNum()-1;//5-1=4
		  
		  //call for loop for columns
		  
		  for(int i=0; i<=lastindex; i++)
		  {
			  String s1=data.getRow(0).getCell(i).getStringCellValue();   //
			  System.out.println(s1+" ");
		  }
		 
	}
}
