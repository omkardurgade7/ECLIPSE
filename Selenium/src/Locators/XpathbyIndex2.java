package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyIndex2 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		  
		  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Omkar");
		  
		  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Durgade");
		  
		  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567890");
}
}