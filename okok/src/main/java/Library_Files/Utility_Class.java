package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_Class 
{

	      public static String getdatafromppfile(String key) throws IOException
	      {
	    	  
	    	  FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\okok\\credentials.properties");
	    	  
	    	  Properties pro=new Properties();
	    	  pro.load(file);
	    	  
	    	  String value=pro.getProperty(key);
	    	  return value;
	    	  
	      }
}
