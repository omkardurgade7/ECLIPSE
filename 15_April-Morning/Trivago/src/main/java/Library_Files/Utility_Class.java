package Library_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{

	 public static String getdatafromEXCELSHEET(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Trivago\\Test Data\\trivago.com.xlsx");
		 String s1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
		 return s1;
	 }
}
