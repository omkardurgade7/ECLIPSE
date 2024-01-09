package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Snapdeal {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
	     ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.snapdeal.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement search=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		 Thread.sleep(2000);
		 search.sendKeys("iphone");
		 search.clear();
		 search.sendKeys("mens sneakers");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@class='dp-widget-link hashAdded'])[1]")).click();
		 Thread.sleep(2000);
}
}