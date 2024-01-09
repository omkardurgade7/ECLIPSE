package Library_Files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
    public WebDriver driver;
    
    public void initializebrowser()
    {
    	driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://ecommerce.tealiumdemo.com/customer/account/login/");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	
    	
    }
}
