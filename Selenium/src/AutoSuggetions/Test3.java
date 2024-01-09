package AutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {
      
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
	   	 ChromeOptions CO=new ChromeOptions();	 
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.get("https://www.google.com/");
	   	 Thread.sleep(2000);
	   	 
	   	 driver.manage().window().maximize();
	   	Thread.sleep(2000);
	   	
	   	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
	   	Thread.sleep(2000);
	   	
	   	List<WebElement> google=driver.findElements(By.xpath("//div[@class='aajZCb']//li"));
	   	
	   	for(WebElement suggetion:google)
	   	{
	   		String h1=suggetion.getText();
	   		
	   		if(h1.equals("java compiler"))
	   		{
	   			suggetion.click();
	   			break;
	   		}
	   	}
	
	}
}
