package Dropdown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("file:///C:/Users/Compaid_Asus/Downloads/MultiselectableListbox.html");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement t1=driver.findElement(By.xpath("//select[@id='1234']"));
		 Select u1=new Select(t1);
		 u1.selectByVisibleText("Ind");
		 u1.selectByVisibleText("Pak");
		 u1.selectByVisibleText("Sri");
		 u1.selectByVisibleText("Aus");
		 
}
}
