package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test9 {
                      //last column or cell index
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  	
		  	FileInputStream soul=new FileInputStream("D:\\\\Selenium Excel Sheet\\\\Parameterization Excel sheet.xlsx");
		  	
		  	int get=WorkbookFactory.create(soul).getSheet("Sheet1").getRow(0).getLastCellNum()-1;
		  	
		  	System.out.println(get);
}
}