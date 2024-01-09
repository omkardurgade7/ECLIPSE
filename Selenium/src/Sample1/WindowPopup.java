package Sample1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup {

	
	public static void main(String[] args) throws InterruptedException 
  	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  	
  		 driver.get("https://nxtgenaiacademy.com/multiplewindows/");
  		 
  		 driver.manage().window().maximize();
  		 
  		 driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
  		 
  		 java.util.Set<String> id=driver.getWindowHandles();
  		
  		ArrayList<String> h1=new ArrayList<String>(id);
  		
  		String mpid=h1.get(0);
  		String wpid=h1.get(1);
  		
  		driver.switchTo().window(wpid);
  		
  		 driver.findElement(By.xpath("(//a[text()='Python for Automation'])[2]")).click();
  		 
  		 driver.switchTo().window(mpid);
  		 
  		 driver.findElement(By.xpath("(//a[text()='Free Automation Courses'])[2]")).click();
  		 
  		 
}
}