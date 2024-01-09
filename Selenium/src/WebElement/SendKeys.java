package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeys {

	
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("omkar@12345");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='email']")).clear();
		 
		 
		 
}
}