package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class {

	
	public static String getdatafromcredentials(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Practice\\credentials.properties");
		Properties pro=new Properties();
		pro.load(file);
		String value=pro.getProperty(key);
		return value;
	}
	public static String getdatafromexcelsheet(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Practice\\Test_Data\\newwww.xlsx");
		String k1=WorkbookFactory.create(file).getSheet("Sheet9").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return k1;
	}
	
	
}
