package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	 public static void main(String[] args) throws InterruptedException {
		  ChromeOptions qo=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(qo);
		  
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  driver.get("https://www.google.co.in/");
		  Thread.sleep(1000);
		  
		   WebElement no=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
		   Thread.sleep(1000);
		   
		  Actions act=new Actions(driver);
		  
		  act.doubleClick(no).perform();
		  
	}
}
