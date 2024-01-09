package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertpopup1
{
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(2000);

         driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Admin123");
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//input[@name='submit']")).click();
         Thread.sleep(2000);
        
         //to shift focus of webpage to alert popup
         Alert alt=driver.switchTo().alert();
         Thread.sleep(2000);
         alt.accept();
         
         
         



}
}