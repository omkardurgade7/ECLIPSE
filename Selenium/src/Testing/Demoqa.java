package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://demoqa.com/text-box");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement username=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		 
		 username.sendKeys("Omkar");
		 Thread.sleep(2000);
		 username.clear();
		 username.sendKeys("james");
		 Thread.sleep(2000);
		 username.clear();
		 username.sendKeys("James Cameron");
		 
		 WebElement email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		
		 email.sendKeys("james123@gmail.com");
		 email.clear();
		 Thread.sleep(2000);
		 email.sendKeys("jamescameron123@gmail.com");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("420 Harry L Dr, Johnson City, NY 13790, United States");
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("420 Harry L Dr, Johnson City, NY 14999, United States");
		 
}
}