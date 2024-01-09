package Library_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_Class 
{

	    @Test
	    public static String getdatafrompropertiesfile(String key) throws IOException
	    {
	    	FileInputStream prop=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Sample_Practice\\idpass.properties");
	    	
	    	Properties pro=new Properties();
	    	pro.load(prop);
	    	
	    	String value=pro.getProperty(key);
	    	return value;
	    }
	    
	    
	    
	    
}
