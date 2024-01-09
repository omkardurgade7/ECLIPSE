package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{
   public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.google.com/");
	   
	   driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("ireda share price");
	   
	   Actions act=new Actions(driver);
	   act.sendKeys(Keys.ENTER).perform();
	   
	   WebElement dynamic=driver.findElement(By.xpath("((//div[@class='PZPZlf'])[1]//span)[6]"));
	   
	   String dd=dynamic.getText();
	   
	   System.out.println(dd);
	   
	   driver.quit();
}
}
