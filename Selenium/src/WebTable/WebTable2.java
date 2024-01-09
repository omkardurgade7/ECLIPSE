package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
   	 ChromeOptions CO=new ChromeOptions();
   	 WebDriver driver=new ChromeDriver(CO);
   	 
   	 driver.manage().window().maximize();
   	 Thread.sleep(2000);
   	 
   	 driver.get("https://omayo.blogspot.com");
   	 Thread.sleep(2000);

   	 
   	List<WebElement> cellsize=driver.findElements(By.xpath("//table[@id='table1']//tr[1]//th"));
   	 
   	 int d1=cellsize.size();
   	 System.out.println(d1);
   	 
}
}