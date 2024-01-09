package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyAttribute9 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.get("https://www.youtube.com/");
		
		        //wait 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("T series");
				
				driver.findElement(By.cssSelector("id.Taarak Mehta Ka Ooltah Chashmah - तारक मेहता का उल्टा चशमाह - Episode 904 - Full Episode"))
				.click();
				
}
}