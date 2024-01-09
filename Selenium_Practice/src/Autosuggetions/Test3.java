package Autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {

	    public static void main(String[] args) throws InterruptedException {
			
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.google.com/");
	    	Thread.sleep(1000);
	    	
	    	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("google");
	    	Thread.sleep(1000);
	    	
	    	List<WebElement> sugg=driver.findElements(By.xpath("//li[@class='sbct']"));
	    	Thread.sleep(1000);
	    	
	    	for(WebElement hh:sugg)
	    	{
	    		String s1=hh.getText();
	    		Thread.sleep(1000);
	    		
	    		if(s1.equals("google meet"))
	    		{
	    			Thread.sleep(1000);
	    			hh.click();
	    			break;
	    		}
	    	}
	    	
	    	driver.findElement(By.xpath("//h3[text()='Google Meet - Online Video Calls, Meetings and Conferencing']")).click();
	    	
		}
}
