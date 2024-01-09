package Parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Test1 {

	
	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    	
	    	FileInputStream Co=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
	    	String sh=WorkbookFactory.create(Co).getSheet("Sheet10").getRow(0).getCell(0).getStringCellValue();
		    
	    	System.out.println(sh);
	    	
		}
}
