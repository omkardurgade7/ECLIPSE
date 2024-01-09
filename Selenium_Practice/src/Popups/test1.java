package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
	     ChromeOptions CO=new ChromeOptions();			
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		 
		 org.openqa.selenium.Alert alt=driver.switchTo().alert();
		 Thread.sleep(2000);
		 
		 alt.accept();

}
}