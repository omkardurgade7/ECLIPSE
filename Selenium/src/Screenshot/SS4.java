package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class SS4 {

	//Take a Screenshot of particular section
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
	
	    driver.get("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement s1=driver.findElement(By.xpath("(//div[@id='contents'])[2]"));
	
	
	File Source=s1.getScreenshotAs(OutputType.FILE);
	
	File Destination=new File("D:\\.Youtube.jpeg");
	
	FileHandler.copy(Source, Destination);
	
	}
}