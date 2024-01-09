package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustomizedListbox {

	
	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions CO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(CO);
		
		   driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		   Thread.sleep(2000);
		   
		   WebElement country=driver.findElement(By.xpath("//select"));
		   Thread.sleep(2000);
		   
		   Actions act=new Actions(driver);
		   
		   act.click(country).perform();
		   Thread.sleep(2000);
		   
		   for(int i=1; i<=102; i++)
		   {
			   Thread.sleep(100);
			   act.sendKeys(Keys.ARROW_DOWN).perform();
		   }   
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ENTER).perform();
		   
		  // act.sendKeys(Keys.ARROW_DOWN).perform();//78
		   
		   
		   
	}
}
