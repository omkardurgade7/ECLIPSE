package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_Class 
{
  public static String getdatafromppfile(String key) throws IOException
  {
	  FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\E_Commerce\\Login_Credentials.properties");
	  
	  Properties okay=new Properties();
	  
	  okay.load(file);
	  
	  String value=okay.getProperty(key);
	  
	  return value;
	  
  }
}
