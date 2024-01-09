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
import Module.Search_Hotel;

public class Test_Class extends Base_Class 
{
      Search_Hotel hotel;
      
      @BeforeClass
      public void openBROWSER()
      {
      initializeBROWSER();
      
      hotel=new Search_Hotel(driver); 
       }
      
      @BeforeMethod
      public void login()
      {
    	  Reporter.log("login", true);
      }
      
      @Test
      public void selecthotel() throws EncryptedDocumentException, IOException, InterruptedException
      {
    	  hotel.enterdestination(Utility_Class.getdatafromEXCELSHEET(0, 0));
    	  hotel.clickchekcindatebutton();
    	 /* hotel.selectcheckinmonth(Utility_Class.getdatafromEXCELSHEET(1, 0));
    	  hotel.selectcheckindate(Utility_Class.getdatafromEXCELSHEET(2, 0));
    	  hotel.clickcheckout();
    	  hotel.selectcheckoutmonth(Utility_Class.getdatafromEXCELSHEET(4, 0));
    	  hotel.selectchrckoutdate(Utility_Class.getdatafromEXCELSHEET(5, 0)); */
    	  hotel.selectdate();
    	 // hotel.clickcheckoutbutton();
    	  hotel.selectchechoutdate();
    	  hotel.clickroombutton();
    	  hotel.clickapplybutton(); 
    	  hotel.clicksearchbutton();
      }
      
      @AfterMethod
      public void logout()
      {
    	  Reporter.log("logout", true);
      }
      
      @AfterClass
      public void closebrowser()
      {
    	  //driver.quit();
      }
}
