package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop1 {	
		public static void main(String[] args) throws InterruptedException 
		{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
			 ChromeOptions CO=new ChromeOptions();	
			 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
			
			 WebDriver  driver=new ChromeDriver(CO); 
	          
			 driver.get("https://demo.guru99.com/test/drag_drop.html");
			 Thread.sleep(2000);
			 
			 driver.manage().window().maximize(); 	
			 
			 //find element of both drag and drop 
			 
			WebElement source=driver.findElement(By.xpath("//a[text()='5000']"));
			
			WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
			
			//create object of action class
			Actions dnd=new Actions(driver);
			
			//call the methods
			dnd.dragAndDrop(source,destination).perform();			
			
			
			
	
	
	
	
	

}
}