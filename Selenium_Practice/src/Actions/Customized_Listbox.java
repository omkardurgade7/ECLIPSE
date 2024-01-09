package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Customized_Listbox {


    public static void main(String[] args) throws InterruptedException {
		

    	ChromeOptions CO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(CO);
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    	
    	Thread.sleep(2000);
    	
    	WebElement okay=driver.findElement(By.xpath("//select[@fdprocessedid='a7b7ud']"));
    	Thread.sleep(2000);
    	
    	Actions act=new Actions(driver);
    	
    	act.click(okay).perform();
    	
    	Thread.sleep(2000);
    	
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	
    	act.sendKeys(Keys.ENTER).perform();
    	
	}
}
