package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test7 {

        //find row size
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
  	
  	FileInputStream size=new FileInputStream("D:\\\\Selenium Excel Sheet\\\\Parameterization Excel sheet.xlsx");
  	
  	int index=WorkbookFactory.create(size).getSheet("Sheet1").getLastRowNum()+1;
  	
  	System.out.println(index);
  	
}
}