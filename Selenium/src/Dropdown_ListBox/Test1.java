package Dropdown_ListBox;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{	System.setProperty("webdriver.chrome.driver", "C:\\selenium_Webdriver\\chromedriver.exe");	
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(2000);
		 
		 //find element of listbox
		 WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		 
		 //create object of select class
		 Select s1=new Select(Month);
		 
		 //call method
		 s1.selectByVisibleText("May");
		 
		 Thread.sleep(2000);
		 
		 
}
}