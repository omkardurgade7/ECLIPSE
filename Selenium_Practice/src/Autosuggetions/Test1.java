package Autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	
	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions CO=new ChromeOptions();;
		   WebDriver driver=new ChromeDriver(CO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		   
		   driver.get("https://www.google.com/");
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("iphone 15");
		   Thread.sleep(1000);
		   
		   List<WebElement> sugg=driver.findElements(By.xpath("//li[@class='sbct']"));
		   Thread.sleep(1000);
		   
		   for(WebElement kk:sugg)
		   {
			   String s1=kk.getText();
			   Thread.sleep(1000);
			   
			   if(s1.equals("iphone 15 pro max"))
			   {
				   Thread.sleep(1000);
				   kk.click();
				   break;
			   }
		   }
		   
		   WebElement name=driver.findElement(By.xpath("(//span[text()='Apple - iPhone 15 Pro Max 256GB Natural Titanium'])[1]"));
		   String phone=name.getText();
		   System.out.println(phone);
		   
		   WebElement price=driver.findElement(By.xpath("(//*[@class='pla-unit-container']//div//div[5])[1]"));
		   String s1=price.getText();
		   System.out.println(s1);
		   
		   
		   
		   driver.close();
		   
		   
	}
}
