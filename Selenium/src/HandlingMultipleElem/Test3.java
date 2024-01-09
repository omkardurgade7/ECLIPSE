package HandlingMultipleElem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.instagram.com/accounts/login/");
		 Thread.sleep(2000);
		 
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 List<WebElement> snapchat=driver.findElements(By.xpath("//a"));
		 
		 //use for each loop
		 for(WebElement streak:snapchat)
		 {
			 
			 String snap=streak.getText();
			 System.out.println(snap);
		 }
		 
		 
		 
		 
		 
		 
}
}