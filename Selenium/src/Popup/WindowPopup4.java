package Popup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup4 {

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO);
		 
	   driver.get("https://skpatro.github.io/demo/links/");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	   Thread.sleep(2000);
	   
	   Set<String> ids=driver.getWindowHandles();
	   
	   ArrayList<String> arr=new ArrayList<String>(ids);
	   
	   String mpid=arr.get(0);
	   String wpid=arr.get(1);
	   
	   driver.switchTo().window(wpid);
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a[@class='default-btn-shortcode dt-btn dt-btn-l link-hover-off '])[2]")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.switchTo().window(mpid);
	   
}
}