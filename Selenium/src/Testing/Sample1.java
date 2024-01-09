package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("email")).sendKeys("omkar@123");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("pass")).sendKeys("123456");
		 
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("James");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Cameron");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("jamescameron@gmail.com");
		 
}
}