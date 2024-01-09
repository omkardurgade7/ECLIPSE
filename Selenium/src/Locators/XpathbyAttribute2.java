package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyAttribute2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		
	    driver.get("https://kite.zerodha.com/");
		
		        //wait 
				Thread.sleep(2000);
				
				//Enter UserID
				driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("User@123");
				
}
}