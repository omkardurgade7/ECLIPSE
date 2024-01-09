package Module1_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module1.Login;
import Module1.Select_Product;

public class Test1 extends Base_Class
{
        Login loginpage;
        WebDriver driver;
        Select_Product addcart;
        
        @BeforeClass
        public void openbrowser()
        {
        	initializebrowser();
        	loginpage=new Login(driver);
        	addcart=new Select_Product(driver);
        }
        
        @BeforeMethod
        public void logintopage() throws IOException
        {
        	loginpage.enterusername(Utility_Class.getdatafrompropertiesfile("ID"));
        	loginpage.enterpassword(Utility_Class.getdatafrompropertiesfile("PASS"));
        	loginpage.clickbutton();
        }
        
        @Test
        public void addtocart()
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
