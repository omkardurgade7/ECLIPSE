package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movecursor 
{
     public static void main(String[] args) throws InterruptedException {
		
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.google.com/");
    	 Thread.sleep(1000);
    	 
    	 WebElement okay=driver.findElement(By.xpath("//a[@class='gb_d']"));
    	 Thread.sleep(1000);
    	 
    	 Actions act=new Actions(driver);
    	 act.moveToElement(okay).perform();
    	 
    	 okay.click();
	}
}
