package Dropdown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
			
	     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Omkar");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Durgade");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("999999999");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Pass@123");
		 Thread.sleep(2000);
		
		 WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		 Select D1=new Select(Day);
		 D1.selectByValue("30");
		 Thread.sleep(2000);
		
		 WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		 Select S1=new Select(Month);
		 S1.selectByIndex(8);
		 Thread.sleep(2000);
		
		 WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		 Select Y1=new Select(Year);
	     Y1.selectByValue("1999");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		 Thread.sleep(2000);
		
	
		

}
}