package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
            
	   
	public static void main(String[] args) throws InterruptedException 
  	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		
  		 driver.get("https://www.google.co.in/");
  		 
  		 driver.manage().window().maximize();
          WebElement h1=driver.findElement(By.xpath("//a[text()='Images']"));
          
          Actions gg=new Actions(driver);
          
          gg.click(h1).perform();
	
	
}
}