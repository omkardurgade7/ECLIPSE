package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchData1 {

	
	public static void main(String[] args) throws InterruptedException {
		
	   	 ChromeOptions CO=new ChromeOptions();
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	   	 Thread.sleep(2000);
	   	 
	     WebElement pune=driver.findElement(By.xpath("(//tbody[@style='box-sizing:inherit']//td)[18]"));
	   	 String s1=pune.getText();
	   	 System.out.println(s1); 
	   	 
}
}