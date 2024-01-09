package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class SS6
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
		 driver.findElement(By.xpath("https://www.instagram.com/"));
		 Thread.sleep(2000);
		 
		 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destiination= new File("D:\\.sample.jpeg");
		 
		 FileHandler.copy(source, destiination);
		 
		 
		 
		 
}
}