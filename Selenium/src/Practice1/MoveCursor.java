package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor {

	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions ao=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(ao);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		   
		   driver.get("https://www.airindia.com/");
		   Thread.sleep(1000);
		   
		   WebElement search=driver.findElement(By.xpath("//a[text()='Book & Manage']"));
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(search).perform();
  
		    
		   
		   
		   
	}
}
