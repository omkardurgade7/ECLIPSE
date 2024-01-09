package Popup;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Windowpopup1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		 
		 Thread.sleep(2000);
		 
		 //find the ids of main page and window pages
		 Set<String>IDs=driver.getWindowHandles();
		 System.out.println(IDs);
		 
		 // to get ids in index form
		 ArrayList<String> h1=new ArrayList(IDs);
		 
		 String mpid=h1.get(0);
		 System.out.println(mpid);
		 
		 String wpid=h1.get(1);
		 System.out.println(wpid);
		 
		 //switch to window popup id
		 driver.switchTo().window(wpid);
		 Thread.sleep(2000);
		 
		//click on training link
		 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		 Thread.sleep(2000);
		// switch to main page
	 driver.switchTo().window(mpid);
	 
	 Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();

	 
		 
		 

	
	
	
	
	
	
	
	
	}
}