package Module_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Modules.Get_Quote;
import Modules.Login;

public class Test_class extends Base_Class 
{
      Login login;
      Get_Quote get;
      
      @BeforeClass
      public void openbrowser()
      {
    	 initializeBROWSER();
    	 login=new Login(driver);
    	 get=new Get_Quote(driver);
      }
      
      @BeforeMethod
      public void logintoapp() throws IOException
      {
    	 login.clickloginbutton();
    	 login.enteremail(Utility_Class.getdatafrompropertiesfile("username"));
    	 login.enterpassword(Utility_Class.getdatafrompropertiesfile("PASSWORD"));
    	 login.loginbutton();	 
      }
      
      @Test
      public void verifyamount() throws EncryptedDocumentException, IOException
      {
    	  get.clickproducts();
    	  get.clickhealth();
    	  get.clickadd();
    	  get.enterday(Utility_Class.getdatafromEXCELSHEET(0, 0));
    	  get.entermonth(Utility_Class.getdatafromEXCELSHEET(1, 0));
    	  get.enteryear(Utility_Class.getdatafromEXCELSHEET(2, 0));
    	  get.clickdone();
    	  get.enterpincode(Utility_Class.getdatafromEXCELSHEET(4, 0));
    	  get.clickquote();
    	  get.verify(Utility_Class.getdatafromEXCELSHEET(6, 0));
    	  
      }
      
      @AfterMethod
      public void logoutfromapp()
      {
    	  Reporter.log("logout",true);
      }
      
      @AfterClass
      public void closebrowser()
      {
    	 // driver.quit();
      }
	   
}
