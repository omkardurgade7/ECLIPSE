package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
    public static String getdatafrompropertiesfile(String key) throws IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Insurance\\credentials.properties");
    	Properties prop=new Properties();
    	prop.load(file);
    	String value=prop.getProperty(key);
    	return value;  	
    }
    
    public static String getdatafromEXCELSHEET(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Insurance\\Test_Data\\insurance Test data.xlsx");
    	String sh=WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowindex).getCell(cellindex).getStringCellValue();
    	return sh;  	
    }
}
