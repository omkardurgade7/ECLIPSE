package Library_Files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class
{
   //WebDriver driver;
   
     public void initializebrowser()
     {
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.saucedemo.com/?ref=hackernoon.com"); 
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
}
