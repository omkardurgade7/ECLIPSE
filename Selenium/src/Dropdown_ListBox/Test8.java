package Dropdown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("file:///C:/Users/Compaid_Asus/Downloads/MultiselectableListbox.html");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement jjj=driver.findElement(By.xpath("//select[@multiple='true']"));
		 Select yyy=new Select(jjj);
		 yyy.selectByIndex(0);
		 yyy.selectByIndex(1);
		 
		 //get text of first element 
		 WebElement rrr=yyy.getFirstSelectedOption();
		 
		 //to get text of an object 
		 String mmm=rrr.getText();
		 System.out.println(mmm);
		 
		 
		 
		 
}
}