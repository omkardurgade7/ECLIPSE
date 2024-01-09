package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
	   
	   String k1=WorkbookFactory.create(file).getSheet("Sheet10").getRow(6).getCell(0).getStringCellValue();
	   
	   System.out.println(k1);
}
}
