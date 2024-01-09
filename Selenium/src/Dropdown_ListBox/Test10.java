package Dropdown_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test10 {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("file:///C:/Users/Compaid_Asus/Downloads/MultiselectableListbox.html");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement mmm=driver.findElement(By.xpath("//select[@id='1234']"));
		 Select nnn=new Select(mmm);
		 nnn.selectByIndex(0);
		 nnn.selectByIndex(1);
		 nnn.selectByIndex(2);
		 nnn.selectByIndex(3);
		 
		 //get text of all text
		 List<WebElement> ggg=nnn.getAllSelectedOptions();
		 
		 for(WebElement hhh:ggg )
		 {
			 System.out.println(hhh.getText());
		 }
		 
		 
		 System.out.println("---------Another Way--------");
		 List<WebElement> kkk=nnn.getOptions();
		 for(WebElement ddd:kkk)
		 {
			 System.out.println(ddd.getText());
		 }		 
}
}