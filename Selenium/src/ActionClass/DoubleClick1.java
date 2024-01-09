package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	
		 //find element and store into an object
		 WebElement gg=driver.findElement(By.xpath("//div[text()='Google offered in:  ']"));
		 
		 //create object of action class
		 Actions isi=new Actions(driver);
		 
		 //call the method
		 isi.doubleClick(gg).perform();
		 
		 
		 
}
}