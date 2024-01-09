package Test_Class;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module.Login;


public class TC extends Base_Class 
{
	      
           Login loginpage; 
           
           @BeforeClass
           public void openbrowser()
           {
        	   initializebrowser();
        	   
			loginpage=new Login(driver);
           }
           
           @BeforeMethod
           public void logintoapp() throws IOException
           {
        	   loginpage.enterun(Utility_Class.getdatafromppfile("USERNAME"));
        	   loginpage.enterpsw(Utility_Class.getdatafromppfile("PASSWORD"));
        	   loginpage.clicklgoin();
           }
           
           @Test
           public void selecthotel()
           {
        	 Reporter.log("PASS",true);  
           }
           
           @AfterMethod
           public void logoutapp()
           {
          	 Reporter.log("PASS",true);  
 
           }
           
           @AfterClass
           public void closebrowser()
           {
        	   driver.close();
           }
           
           
           
           
           
}
