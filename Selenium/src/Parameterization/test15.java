package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test15 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   
	   FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\Desktop\\TEST CASES-3.xlsx");
	   
	   String okay=WorkbookFactory.create(file).getSheet("YOUTUBE").getRow(7).getCell(6).getStringCellValue();
	   
	   System.out.println(okay);
	   
	   
}
}
