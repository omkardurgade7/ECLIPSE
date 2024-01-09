package Popups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_popup
{
   public static void main(String[] args) throws InterruptedException {
	
	   
	   WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  driver.get("https://demo.automationtesting.in/Windows.html");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		  Thread.sleep(1000);
		  
		 Set<String> ids=driver.getWindowHandles();
		 
		 ArrayList<String> k1=new ArrayList<String>(ids);
		 ArrayList<String> k2=new ArrayList<String>(ids);
		  Thread.sleep(1000);

		 String mpid=k1.get(0);
		 String wpid=k2.get(1);
		  Thread.sleep(1000);

		 driver.switchTo().window(wpid);
		  Thread.sleep(1000);

		 driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]")).click();
		 
		 
}
}
