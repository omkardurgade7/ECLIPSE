package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	     public static void main(String[] args) throws InterruptedException 
	     {
			ChromeOptions qa=new ChromeOptions();
			WebDriver driver=new ChromeDriver(qa);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("https://www.airindia.com/in/en/about-us.html");
			Thread.sleep(1000);
			
			WebElement bookmanage=driver.findElement(By.xpath("//a[@id='headernav0']"));
			Thread.sleep(1000);
			
			Actions act=new Actions(driver);
			
			act.moveToElement(bookmanage).perform();
			Thread.sleep(2000);
			
			WebElement searchflights=driver.findElement(By.xpath("//a[@id='header0menu0link0']"));
			
			act.moveToElement(searchflights).perform();
			Thread.sleep(2000);
			
			act.click(searchflights).perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("((//input[@type='text'])[3]")).sendKeys("Mumbai (BOM)");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("((//input[@type='text'])[4]")).sendKeys("Tokyo (NRT)");
			Thread.sleep(2000);
			
			
			
			
			
		}
}
