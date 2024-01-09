package Sample1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListbox {
        
	
	public static void main(String[] args) throws InterruptedException, IOException 
  	{		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		 
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize(); 
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[text()='Create new account']")).click();
          Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        
        Actions fb=new Actions(driver);
        Thread.sleep(2000);
        fb.click().perform();
        Thread.sleep(2000);
        fb.sendKeys(Keys.ARROW_DOWN).perform();
        fb.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        fb.sendKeys(Keys.ENTER).perform();
        
        
        
        
        
        
        
          
          
}
}