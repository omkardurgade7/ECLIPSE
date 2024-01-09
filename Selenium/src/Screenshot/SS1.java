package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class SS1 {

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.instagram.com/accounts/login/");
		 
		 Thread.sleep(2000);
		 
		 File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println(Source);
			
			File Destination=new File("D:\\.insta.jpeg");
			
             FileHandler.copy(Source,Destination);
			
}
}