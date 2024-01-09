package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StringFrameId {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
        
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 //Switch to iframe(String FrameId)
		 driver.switchTo().frame("iframeResult");
		 
		 //click the button
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	Thread.sleep(2000);
	    
	driver.switchTo().defaultContent();
	
	
	
	
	
	    
}
}