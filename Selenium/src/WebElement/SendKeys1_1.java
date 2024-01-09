package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeys1_1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		 WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		 
		 username.sendKeys("omkar@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 username.clear();
		 
		 Thread.sleep(2000);
		 
		 username.sendKeys("abc@123gmail.com");
	}
	
	
}
