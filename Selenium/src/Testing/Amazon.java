package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get(("https://www.amazon.in/"));
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 14 pro");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//img[@src='https://m.media-amazon.com/images/I/71ZDY57yTQL._AC_UY218_.jpg'])[1]")).click();
		 Thread.sleep(2000);
		 
		 
	}
}
