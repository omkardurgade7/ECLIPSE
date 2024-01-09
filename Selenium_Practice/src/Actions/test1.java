package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
    public static void main(String[] args) {
		
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.saucedemo.com/?ref=hackernoon.com");
    	
    	driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
    	
    	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
    	
    	driver.findElement(By.xpath("//*[@id='login-button']")).click();
    	
    	
    	
	}
}
