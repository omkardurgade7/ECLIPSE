package ActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor3
{
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
	   driver.get("https://demo.automationtesting.in/Frames.html");
	   Thread.sleep(2000);
	   
	   WebElement button=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	   Thread.sleep(2000);
	   
	   Actions okay=new Actions(driver);
	   
	   okay.moveToElement(button).perform();

}
}