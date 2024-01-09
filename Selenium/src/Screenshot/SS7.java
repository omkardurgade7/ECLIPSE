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

public class SS7 {

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.netflix.com/in/");
		 
		 Thread.sleep(2000);
		 WebElement h1=driver.findElement(By.xpath("//h1[text()='Unlimited movies, TV shows and more']"));
		 
		File hmm=h1.getScreenshotAs(OutputType.FILE);
		
		File okay=new File("D:\\.netflix.jpg");
		
		FileHandler.copy(hmm, okay);
		 
}
}