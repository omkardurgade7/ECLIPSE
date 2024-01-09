package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicElement {
              public static void main(String[] args) throws InterruptedException {
				
             ChromeOptions CO=new ChromeOptions();
             WebDriver driver=new ChromeDriver(CO);	  
            	  
             driver.get("https://24timezones.com/Japan/time");
             Thread.sleep(2000);
             
             String time=driver.findElement(By.xpath("((//div[@class='current-time'])//div)[1]")).getText();
             Thread.sleep(2000);
             
             System.out.println(time);
            	  
            	  
}
}
