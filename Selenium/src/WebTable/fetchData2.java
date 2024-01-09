package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fetchData2 {

	
	public static void main(String[] args) throws InterruptedException {
		
	   	 ChromeOptions CO=new ChromeOptions();
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	   	 Thread.sleep(2000);
	   	 
	   	 WebElement data=driver.findElement(By.xpath("(//table[@class='tsc_table_s13']//th)[9]"));
	   	 String s1=data.getText();
	   	 System.out.println(s1);
	   	 
	   	 
}
}