package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyText2 {

	
	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
	
	    driver.get("https://www.instagram.com/accounts/login/");
	
	Thread.sleep(2000);
	
	//click on sign in button
	
	driver.findElement(By.xpath("//a['Forgot Password']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a['Back to login']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span['Sign up']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("omkar@123");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("omkar@123");
	
	
	
}
}