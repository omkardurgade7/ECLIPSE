package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertpopup2 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pass@123");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(2000);
		 
		 Alert a1=driver.switchTo().alert();
		 
		 a1.dismiss();
		
}
}