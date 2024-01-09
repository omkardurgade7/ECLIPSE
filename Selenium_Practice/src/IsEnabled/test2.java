package IsEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 
{
    public static void main(String[] args) {
		
    	ChromeOptions CO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(CO);
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://materializecss.com/radio-buttons.html");
    	
    	WebElement okay=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
    	
    	boolean s1=okay.isEnabled();
    	
    	System.out.println(s1);
	}
}
