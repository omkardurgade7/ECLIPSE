package Dynamic_Element;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test4 
{
    public static void main(String[] args) throws InterruptedException {
		
    	ChromeOptions CO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(CO);
    	
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	
    	driver.get("https://www.cricbuzz.com/");
    	Thread.sleep(1000);
    	
    	WebElement s1=driver.findElement(By.xpath("((//li[@class='cb-view-all-ga cb-match-card cb-bg-white'])[1]//div)[4]")); 
    	
    	String k1=s1.getText();
    	Thread.sleep(1000);
    	
    	System.out.println(k1);
    	
    	driver.close();
    	
    	
	}
}
