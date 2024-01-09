package ActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
	   driver.get("https://www.netflix.com/in/");
	   Thread.sleep(2000);
	   
	   WebElement right=driver.findElement(By.xpath("//select[@name='LanguageSelect'])[1]"));
	   Thread.sleep(2000);
	   
	   Actions hhh=new Actions(driver);
	   
	   hhh.contextClick(right).perform();
	   
}
}