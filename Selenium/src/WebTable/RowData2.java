package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowData2 {

	public static void main(String[] args) throws InterruptedException
	{
	   	 ChromeOptions CO=new ChromeOptions();
	     WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://nxtgenaiacademy.com/webtable/");
	   	 Thread.sleep(2000);
	   	 
	   	 for(int i=1; i<=2; i++)
	   	 {
	   		 WebElement name=driver.findElement(By.xpath("//div[@class='elementor-widget-container'][1]//tr[1]//td["+i+"]"));
	   		 String gg=name.getText();
	   		 System.out.print(gg+" ");
	   	 }
	   	 
}
}