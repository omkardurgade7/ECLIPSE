package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
     
		 driver.get("https://www.amazon.in/nike-sneakers/s?k=nike+sneakers");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 String price=driver.findElement(By.xpath("(((//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1])//span)[29]")).getText();
		 System.out.println(price);
		 Thread.sleep(2000);
		 
		 String discount=driver.findElement(By.xpath("(((//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1])//span)[35]")).getText();
		 System.out.println(discount);
		 
}
}