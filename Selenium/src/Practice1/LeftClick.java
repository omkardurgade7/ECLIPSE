package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {
   public static void main(String[] args) throws InterruptedException {
	  ChromeOptions qo=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(qo);
	  
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  driver.get("https://www.google.co.in/");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("google");
	  Thread.sleep(1000);
	  
	   WebElement no=driver.findElement(By.xpath("//div[@class='vOY7J M2vV3']"));
	   Thread.sleep(1000);
	   
	  Actions act=new Actions(driver);
	  
	  act.click(no).perform();
    
}
}
