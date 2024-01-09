package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyStartswith1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get(("https://kite.zerodha.com/"));
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[starts-with(@class,'text-light')]")).click();
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin1");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admi@123");
		 
		 
}
}