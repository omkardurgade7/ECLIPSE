package Library_Files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class 
{
     public WebDriver driver;
     
     public void initializeBROWSER()
     {
    	 ChromeOptions CO=new ChromeOptions();
    	 driver=new ChromeDriver(CO);
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.icicilombard.com/");
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 
     }
}
