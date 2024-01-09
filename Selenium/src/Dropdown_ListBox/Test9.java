package Dropdown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("file:///C:/Users/Compaid_Asus/Downloads/MultiselectableListbox.html");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
         
		 WebElement ggg=driver.findElement(By.xpath("//select[@id='1234']"));
		 Select ooo=new Select(ggg);
		 ooo.selectByIndex(1);
		 ooo.selectByIndex(0);
		 ooo.selectByIndex(3);
		  
		 WebElement iii=ooo.getFirstSelectedOption();
		 
		 String uuu=iii.getText();
		
		 System.out.println(uuu);
		 
		 
		 
		 
		 
		 
		 
		 
	}
}