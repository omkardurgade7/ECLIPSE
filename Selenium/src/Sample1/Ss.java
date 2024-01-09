package Sample1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Ss {
	public static void main(String[] args) throws InterruptedException, IOException 
  	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		 
          driver.get("https://www.google.co.in/");
          driver.manage().window().maximize();
          
         WebElement screens=driver.findElement(By.xpath("//div[@class='SDkEP']"));
         
       File source=screens.getScreenshotAs(OutputType.FILE);
       
       File dest=new File("D:\\Testing.google.jpeg");
       
       FileHandler.copy(source, dest);
         
         
  		 
  		 
  		 
  		 
  		 
  		 
}
}