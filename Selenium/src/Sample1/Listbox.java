package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(2000);
	  
	     driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	     Thread.sleep(2000);
	     
	   WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	   Thread.sleep(2000);
	   Select s1=new Select(month);
	   Thread.sleep(2000);
	   s1.selectByIndex(0);
	     
	     
	     
	     
	     
}
}