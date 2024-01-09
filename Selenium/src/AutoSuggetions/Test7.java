package AutoSuggetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
    public static void main(String[] args) {
		
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	driver.get("https://www.google.com/");
    	
    	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("ind");
    	
    	List<WebElement> sugg=driver.findElements(By.xpath("//li[@role='presentation']"));
    	
    	for(WebElement gg:sugg)
    	{
    		String okay=gg.getText();
    		if(okay.equals("India"))
    		{
    			gg.click();
    			break;
    		}
    	}
    	
    	
	}
}
