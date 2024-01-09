package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
  public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	  Thread.sleep(1000);
	  
	  org.openqa.selenium.Alert alt=driver.switchTo().alert();
	  Thread.sleep(1000);

	  
	  alt.accept();
	  
	 
	  
	  
	  
}
}
