package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick4 
{
      public static void main(String[] args) {
		
    	  
    	   WebDriver driver=new ChromeDriver();
    	   
    	   driver.manage().window().maximize();
    	   
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   
    	   driver.get("https://www.google.com/");
    	   
    	   WebElement okay=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
    	   
    	   Actions co=new Actions(driver);
    	   
    	   co.contextClick(okay).perform();
    	   
    	   
    	   
    	   
    	   
	}
}
