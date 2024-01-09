package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyAttribute5 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.netflix.com/in/Login");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("Omkar@123");
		 
		 driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("Omkar@123");
		 		 
}
}