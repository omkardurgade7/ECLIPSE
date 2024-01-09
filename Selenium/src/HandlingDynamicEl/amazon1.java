package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
    
		 driver.get("https://www.amazon.in/ASUS-Vivobook-Intel-Core-Evo-i5-12500H-K3502ZA-L502WS/dp/B09YHCTHDY?th=1");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	
	     String views=driver.findElement(By.xpath("((//div[@id='centerCol'])//span)[23]")).getText();
	     System.out.println(views);
	     Thread.sleep(2000);
	     
	     
	
	}	
}
