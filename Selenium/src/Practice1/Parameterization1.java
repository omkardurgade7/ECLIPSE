package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {

	
	  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream dd=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
		  
		  Sheet sh=WorkbookFactory.create(dd).getSheet("Sheet5");
		  
		  int lrn=sh.getLastRowNum();
		  
		  for(int i=0; i<=lrn; i++)
		  {
			 int lcn=sh.getRow(i).getLastCellNum()-1;
			 
			 for(int a=0; a<=lcn; a++)
			 {
				 String allvalue=sh.getRow(i).getCell(a).getStringCellValue();
				 System.out.println(allvalue+" ");
			 }
		  }
		  System.out.println();
		  
		  
	}
}
