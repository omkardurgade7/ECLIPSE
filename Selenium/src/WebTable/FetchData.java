package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchData {

	public static void main(String[] args) throws InterruptedException {
		
	   	 ChromeOptions CO=new ChromeOptions();
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://omayo.blogspot.com");
	   	 Thread.sleep(2000);
	   	 
	     WebElement pune=driver.findElement(By.xpath("(//table[@id='table1']//td)[6]"));
	   	 String s1=pune.getText();
	   	 System.out.println(s1); 
	   	 
	 /* String city=driver.findElement(By.xpath("(//table[@id='table1']//td)[6]")).getText();
	  System.out.println(city);
	   	 */   	 
}
}