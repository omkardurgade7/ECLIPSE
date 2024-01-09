package HandlingMultipleElem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://www.instagram.com/accounts/login/");
		 Thread.sleep(2000);
		 
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 List<WebElement> hmm=driver.findElements(By.xpath("//span"));
		 
		 //for printing use for each loop
		 
		 for(WebElement okay:hmm)
		 {
			 String bye=okay.getText();
			 System.out.println(bye);
			 
		 }
}
}