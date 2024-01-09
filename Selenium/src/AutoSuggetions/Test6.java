package AutoSuggetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{
     public static void main(String[] args) throws InterruptedException {
		
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 driver.get("https://www.google.com/");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("icc");
    	 
    	 List<WebElement> icc=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
    	//li[@class='sbct sbre']
    	 for(WebElement sugg:icc)
    	 {
    		 String gg=sugg.getText();
    		 
    		 if(gg.equals("icc cwc"))
    		 {
    			 sugg.click();
    			 break;
    		 }
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
