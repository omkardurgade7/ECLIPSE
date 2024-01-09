package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor {
  
	
	 public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions CO=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(CO);
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		WebElement move=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Thread.sleep(2000);
		
		Actions cursor=new Actions(driver);
		
		Thread.sleep(2000);
		cursor.moveToElement(move).perform();
		 
	}
}
