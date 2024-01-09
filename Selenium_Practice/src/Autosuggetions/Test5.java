package Autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    Thread.sleep(1000);
    
    driver.get("https://www.google.com/");
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("adidas");
    Thread.sleep(1000);
    
    List<WebElement> sugg=driver.findElements(By.xpath("//li[@role='presentation']"));
    Thread.sleep(1000);
    
    for(WebElement okay:sugg)
    {
    	String s1=okay.getText();
    	Thread.sleep(1000);
    	
    	if(s1.equals("Adidas Originals"))
    	{
    		okay.click();
    		break;   		
    	}
    }
    driver.quit();
    
    
}
}