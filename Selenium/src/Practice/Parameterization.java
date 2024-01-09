package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	     public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
	    	 FileInputStream hello=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
	    	 
	    	 Sheet data=WorkbookFactory.create(hello).getSheet("Sheet1");
	    	 
	    	 int lri=data.getLastRowNum();
	    	 
	    	 for(int i=0; i<=lri; i++)
	    	 {
	    		 int lci=data.getRow(i).getLastCellNum()-1;
	    		 
	    		 for(int a=0; a<=lci; a++)
	    		 {
	    			 String s1=data.getRow(i).getCell(a).getStringCellValue();
	    			 System.out.print(s1+" ");
	    		 }
	    		 System.out.println();
	    		 
	    	 }
	    	 
	    	 
	    	 
		}
}
