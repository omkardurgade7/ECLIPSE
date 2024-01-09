package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {
     
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome.0.35i39i650j46i67i131i199i433i465i650j69i64j0i20i131i263i433i512j0i67i131i433i650j0i131i433i512l3.1863j0j15&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		
		WebElement lclick=driver.findElement(By.xpath("(//h3[text()='Google'])[1]"));
		
		Actions dd=new Actions(driver);
		
		dd.click(lclick).perform();
	}
}
