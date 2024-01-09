package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test8 {
             //find cell or column size?
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  	
		  	FileInputStream notok=new FileInputStream("D:\\\\Selenium Excel Sheet\\\\Parameterization Excel sheet.xlsx");
		  	
		  	int cell=WorkbookFactory.create(notok).getSheet("Sheet2").getRow(0).getLastCellNum();
		  	
		  	System.out.println(cell);
}
}