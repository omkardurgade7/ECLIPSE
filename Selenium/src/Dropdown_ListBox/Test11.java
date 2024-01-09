package Dropdown_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test11 {


	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(2000);
		 
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select h1=new Select(month);
		
		List<WebElement> u1=h1.getOptions();
		
		for(WebElement j1:u1)
		{
			System.out.println(j1.getText());
		}
		
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		Select d1=new Select(day);
		
		List<WebElement> o1=d1.getOptions();
		
		for(WebElement n1:o1)
		{
			System.out.println(n1.getText());
		}
		
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select v1=new Select(year);
		
		List<WebElement> k1=v1.getOptions();
		
		for(WebElement c1:k1)
		{
		System.out.println(c1.getText());	
		}
		
		 
		
		
		
		
		
		
		
		
		
		
		
}
}
