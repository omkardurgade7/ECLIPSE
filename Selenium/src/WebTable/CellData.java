package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CellData {

	
	public static void main(String[] args) throws InterruptedException
	{
	   	 ChromeOptions CO=new ChromeOptions();
	     WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("http://omayo.blogspot.com/");
	   	 Thread.sleep(2000);
	   	 
	   	 for(int i=1; i<=4; i++)
	   	 {
	   		 WebElement text=driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]//td[1]"));
	   		 String okay=text.getText();
	   		 System.out.println(okay);
	   	 }
	   	 
	   	 
	   	 
}
}