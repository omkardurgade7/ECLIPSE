package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor {

	
	public static void main(String[] args) throws InterruptedException 
  	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		
  		 driver.get("https://www.dropbox.com/");
  		 driver.manage().window().maximize();
  		WebElement s1=driver.findElement(By.xpath("(//span[text()='Solutions'])[1]"));
  		 Thread.sleep(2000);
  		 Actions ok=new Actions(driver);
  		Thread.sleep(2000);
  		 ok.moveToElement(s1).perform();
}
}