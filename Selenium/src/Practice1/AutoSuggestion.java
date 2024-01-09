package Practice1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestion {

	
	 public static void main(String[] args) throws InterruptedException {
			
		   ChromeOptions SO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(SO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.get("https://www.google.com/");
		   Thread.sleep(2000);
	 
	       driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cricket");
	       Thread.sleep(2000);
	     //div[@class='aajZCb']//li
	       
	       List<WebElement> opt=driver.findElements(By.xpath("//div[@class='aajZCb']//li"));
	       
	       for(WebElement s1:opt)
	       {
	       String a1=s1.getText();
	       Thread.sleep(2000);
	       if(a1.equals("cricket score"))
	       {
	    	   s1.click();
	    	   break;
	       }
	       }
	 
	 
	 }
}

