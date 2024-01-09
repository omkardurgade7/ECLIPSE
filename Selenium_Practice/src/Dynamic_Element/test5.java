package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test5 
{
            public static void main(String[] args) throws InterruptedException {
        //	System.setProperty("webdriver.chrome.driver", "C:\\selenium_Webdriver\\chromedriver.exe");	
        	ChromeOptions co=new ChromeOptions();	
        	// co.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
        	WebDriver driver=new ChromeDriver(co);
        	
        	driver.manage().window().maximize();
        	Thread.sleep(1000);
        	
        	driver.get("https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX2F5QT/ref=sr_1_1_sspa?keywords=iphone&qid=1702098792&s=electronics&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
        	Thread.sleep(1000);
        	
        	WebElement element=driver.findElement(By.xpath("(//div[@id='apex_desktop']//span)[3]"));
        	Thread.sleep(1000);
        	
        	String s1=element.getText();
        	
        	System.out.println(s1);
        	
        	driver.quit();
		}
}
