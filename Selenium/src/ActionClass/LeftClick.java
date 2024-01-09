package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick
{
     public static void main(String[] args) {
		
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 driver.get("https://www.google.com/");
    	 
    	 WebElement okay=driver.findElement(By.xpath("(//a[@class='pHiOh'])[1]"));
    	 
    	 Actions kk=new Actions(driver);
    	 
    	 kk.click(okay).perform();
    	 
	}
}
