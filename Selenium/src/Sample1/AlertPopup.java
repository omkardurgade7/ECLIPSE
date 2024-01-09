package Sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {
      
  	public static void main(String[] args) throws InterruptedException 
  	{	
  		 ChromeOptions CO=new ChromeOptions();	
  		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
  		
  		 WebDriver  driver=new ChromeDriver(CO); 
  		 
  		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
  		 
  		 driver.findElement(By.xpath("//button[@name='alertbox']")).click();
  		 Thread.sleep(2000);
  		 Alert s1=driver.switchTo().alert();
  		 
  		 s1.dismiss();
  		 
  		 
  		 
  		 
  		 
  		 
  		 
  		 
}
}