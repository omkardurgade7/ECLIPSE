package AutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
       
	   public static void main(String[] args) throws InterruptedException {
			
	    	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
	    	 ChromeOptions CO=new ChromeOptions();	 
	    	 WebDriver driver=new ChromeDriver(CO);
	    	 //enter url
	    	 driver.get("https://www.google.com/");
	    	 Thread.sleep(2000);
	    	 driver.manage().window().maximize();
	    	 
	    	 //enter iphone14
	    	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iphone14");
	    	 Thread.sleep(2000);
	    	 
	    	 //highlights all the options
	    	 List<WebElement> options=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//div"));	
	    	 Thread.sleep(2000);
	    	 
	    	 for(WebElement phone:options)
	    	 {
	    		 String text=phone.getText();
	    		
	    		 if(text.equals("iPhone 14 Pro"))
	    		 {
	    			 phone.click();
	    			 break;
	    		 }
	    	 }
	    
		}
}
