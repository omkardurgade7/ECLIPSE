package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		 
		 //identify element and store into an object
	WebElement j1=driver.findElement(By.xpath("//span[text()='Cart']"));
	
	//create object of Actions class
	Actions h1=new Actions(driver);
	
	//call the methods
	h1.contextClick(j1).perform();
		 
}
}