package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {
	
	public static void main(String[] args) throws InterruptedException 
  	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  	
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		 
  		 
  		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
  		 Thread.sleep(2000);
  		 WebElement drag=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));

  	     WebElement drop=driver.findElement(By.xpath("//div[@id='trash']"));
  	     
  	     Actions dd=new Actions(driver);
  	     Thread.sleep(2000);
  	     dd.dragAndDrop(drag, drop);
  	
  	
  	
  	
  	
  	}
}