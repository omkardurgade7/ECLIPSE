package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowpopup2 {

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
	
		 //To get IDs of mainPage and window Pop-up
			Set<String> IDs=driver.getWindowHandles();   //mainPageID  ChildwindowID
				 System.out.println(IDs);
				 
			 ArrayList<String> al=new ArrayList<String>(IDs);  //mainPageID  ChildwindowID 

			 //To get mainPageID
				String  MPID=al.get(0);  //mainPageID
				 System.out.println(MPID);
				 
				 //To get Window Pop-up ID
				 String WPID=al.get(1);   //ChildwindowID
				 System.out.println(WPID);
				  
				 //Switch to window pop-up
				driver.switchTo().window(WPID);
				 
				 
				 Thread.sleep(2000);
				
				 //Click Training Link
				 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
				 
				 Thread.sleep(2000);
				 
				 //Switch to Main Page
				 driver.switchTo().window(MPID);
				 
				 Thread.sleep(2000);
				 
				 //Click New Window Button
				 driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
				  

		
}}
