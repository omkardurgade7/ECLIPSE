package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		WebElement rclick=driver.findElement(By.xpath("//textarea[@type='search']"));
		
		Actions dd=new Actions(driver);
		
		dd.contextClick(rclick).perform();
	}
}
