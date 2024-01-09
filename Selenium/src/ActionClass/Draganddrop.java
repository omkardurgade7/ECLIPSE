package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
   public static void main(String[] args) {
	
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://www.google.com/search?q=google&sca_esv=596135067&tbm=isch&sxsrf=ACQVn09YSjGmVsKo6braC0JQJZyzIh3BgA:1704517563829&source=lnms&sa=X&ved=2ahUKEwju2Z7f_seDAxUpSWwGHfQBDpQQ_AUoAHoECAIQCg&biw=1536&bih=502&dpr=1.25");
	   
	   WebElement okay=driver.findElement(By.xpath("(//a[@class='FRuiCf islib nfEiy'])[1]"));
	   WebElement gg=driver.findElement(By.xpath("//input[@class='og3lId']"));
	   
	   Actions co=new Actions(driver);
	   
	   co.dragAndDrop(okay,gg).perform();
	   
	   
}
}
