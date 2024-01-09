package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Move_Cursor
{
	

    public static void main(String[] args) {
		

    	ChromeOptions CO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(CO);
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.google.com/");
    	
    	WebElement okay=driver.findElement(By.xpath("(//*[@value='Google Search'])[2]"));
    	
    	Actions qa=new Actions(driver);
    	
    	qa.moveToElement(okay).perform();
	}

}
