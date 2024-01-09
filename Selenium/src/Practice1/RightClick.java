package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
     
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions jo=new ChromeOptions();
		WebDriver driver=new ChromeDriver(jo);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		Thread.sleep(1000);
		
		WebElement impnote=driver.findElement(By.xpath("//td[text()='Important Note:']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(impnote).perform();
		
	}
}
