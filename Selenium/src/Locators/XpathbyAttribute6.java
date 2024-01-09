package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyAttribute6 {

	
	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.website.com/sign-in/?source=SC&country=IN");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Google@123");
		 
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("google@123");
}
}