package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize(); 	
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(2000);
		 
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		
		Actions fb=new Actions(driver);
		
		fb.click(month).perform();
		Thread.sleep(2000);
		fb.sendKeys(Keys.ARROW_DOWN).perform();
	
		fb.sendKeys(Keys.ARROW_DOWN).perform();
		fb.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		fb.sendKeys(Keys.ENTER).perform();
		
		
}
}