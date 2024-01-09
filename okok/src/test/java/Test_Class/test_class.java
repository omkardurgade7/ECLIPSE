package Test_Class;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library_Files.Utility_Class;
import Module.Login;
import Module.verify_username;

public class test_class //extends Base_Class 
{
    Login loginpage;
    verify_username verification;
    WebDriver driver=new ChromeDriver();
    WebDriver driver1=new FirefoxDriver();
    WebDriver driver3=new EdgeDriver();
    
//public WebDriver driver;
	@Parameters("browserName")
	public void initializebrowser(String browserName)
	{
		
		//driver=new ChromeDriver();
		WebDriver driver=null;
		   
		   if(browserName.equals("Chrome"))
		   {
			   ChromeOptions CO=new ChromeOptions();
			   driver=new ChromeDriver(CO);	   
		   }
		   else if(browserName.equals("Firefox"))
		   {
			   driver=new FirefoxDriver();
		   }
		   else if(browserName.equals("Edge"))
		   {
			   driver=new EdgeDriver();
		   }
		   		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    
    @BeforeClass
    public void openbrowser()
    {
    	loginpage=new Login(driver); 
    	verification=new verify_username(driver);
    }
    
    @BeforeMethod
    public void logintoapp() throws IOException
    {
    	loginpage.enterusername(Utility_Class.getdatafromppfile("username"));
    	loginpage.enterpassword(Utility_Class.getdatafromppfile("password"));
    	loginpage.clickloginbutton();
    }
    
    @Test
    public void verific() throws IOException
    {
    	String act=verification.getactualusername();
    	String expected=Utility_Class.getdatafromppfile("expectedusername");
    	Assert.assertEquals(act, expected);
    }
    
    @Test
    public void selecthotel()
    {
    	
    }
    
    @AfterMethod
    public void logoutapp()
    {
    	verification.logout();
    	verification.againlogin();
    }
    
    @AfterClass
    public void closebrowser()
    {
    	driver.close();
    }
}
