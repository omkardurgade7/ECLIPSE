package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CellData3 {

	
	public static void main(String[] args) throws InterruptedException
	{
	   	 ChromeOptions CO=new ChromeOptions();
	     WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://chercher.tech/practice/table");
	   	 Thread.sleep(2000);
	   	                                                  
	   	 for(int i=1; i<=4; i++)                          
	   	 {                                                
	   		 WebElement cell=driver.findElement(By.xpath("//table[@id='webtable']/tbody/tr["+i+"]/td[1]"));
	   		 String data=cell.getText();
	   		 System.out.println(data);
	   	 }
	   	 
	   	 
	}
}
