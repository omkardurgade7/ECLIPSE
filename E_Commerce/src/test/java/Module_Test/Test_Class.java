package Module_Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_class;
import Library_Files.Utility_Class;
import Modules.Login;

public class Test_Class extends Base_class 
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
	     loginpage.enteremail(Utility_Class.getdatafromppfile("EMAIL"));
	     loginpage.enterpassword(Utility_Class.getdatafromppfile("PASSWORD"));
	     loginpage.clicklogin();
	  }
	  
	  @Test
	  public void verifyusername()
	  {
		  
	  }
	  
	  @AfterMethod
	  public void logoutfromapp()
	  {
		  
	  }

	  @AfterClass
	  public void closebrowser()
	  {
		  driver.close();
	  }
	  
	  
}
