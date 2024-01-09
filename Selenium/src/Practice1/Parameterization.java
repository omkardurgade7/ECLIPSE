package Practice1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Parameterization {

	   public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		   FileInputStream gg=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
		   
		   Sheet sh=WorkbookFactory.create(gg).getSheet("Sheet4");
		   
		   int lr=sh.getLastRowNum();
		   
		   for(int i=0; i<=lr; i++)
		   {
			  int lc=sh.getRow(i).getLastCellNum()-1;
			 for(int a=0; a<=lc; a++)
			 {
				 String value=sh.getRow(i).getCell(a).getStringCellValue();
				 
				 System.out.println(value+" ");
			 }
		   }
		   System.out.println();
			

		   
	}
}
