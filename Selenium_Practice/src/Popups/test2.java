package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 
{
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions CO=new ChromeOptions();			
	 WebDriver  driver=new ChromeDriver(CO); 
     
	 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//li[text()='Open New Window']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//a[text()='Click Here'])[2]")).click();
	 Thread.sleep(1000);
	 
	 Set<String> ids=driver.getWindowHandles();
	 
	 ArrayList<String> a1=new ArrayList<String>(ids);
	 
	 String mpid=a1.get(0);
	 String wpid=a1.get(1);
	 
	 driver.switchTo().window(wpid);
	 Thread.sleep(1000);
	 String s1=driver.findElement(By.xpath("//div[@class='sixteen columns']//h1")).getText();
	 Thread.sleep(1000);
	 System.out.println(s1);
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//*[text()='Click Here'])[1]")).click();
	 
	 
	 
	 
	 
}
}