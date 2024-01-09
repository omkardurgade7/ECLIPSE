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

public class SS5 {

	//Take SS for Particular section
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.amazon.in/nike-sneakers/s?k=nike+sneakers");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		WebElement sneaker=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[8]"));
		
		File Source=sneaker.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("D:\\.Sneaker.jpeg");
		
		FileHandler.copy(Source, Destination);
		 
}
}