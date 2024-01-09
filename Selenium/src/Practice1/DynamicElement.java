package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicElement {

	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions XO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(XO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.get("https://www.worldtimeserver.com/current_time_in_IN.aspx");
		   Thread.sleep(2000);
		   
		  String time=driver.findElement(By.xpath("(//div[@class='local-time']//span)[1]")).getText();
		   
		  System.out.println(time);
		   
		   
		   
	}
}
