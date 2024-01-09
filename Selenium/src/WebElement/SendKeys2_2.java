package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeys2_2 {

	
	public static void main(String[] args) throws InterruptedException 
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.instagram.com/accounts/login/");
		 
		 Thread.sleep(2000);
		 
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 
		 username.sendKeys("9999999999");
		 username.clear();
		 username.sendKeys("8888888888");
		 
		 
}}
