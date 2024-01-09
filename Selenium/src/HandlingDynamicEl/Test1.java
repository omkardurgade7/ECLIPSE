package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
      
		 driver.get("https://www.flipkart.com/search?q=iphone+14+pro+max&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_5_7_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_5_7_na_na_na&as-pos=5&as-type=RECENT&suggestionId=iphone+14+pro+max&requestId=cb4fd127-fcf3-49f2-9c64-3db32593fb23&as-searchtext=iphone%2014%20pro%20max");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 String rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		 Thread.sleep(2000);
		 
		 System.out.println(rating);
		 
		 String review=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		 System.out.println(review);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}