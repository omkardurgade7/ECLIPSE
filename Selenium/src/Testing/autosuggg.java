package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class autosuggg {
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=14473401039393931417&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007789&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	  
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("smarttv");
      
      Thread.sleep(2000);
     List<WebElement> smartwatch=driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])//div"));
     Thread.sleep(2000);
     for(WebElement y1:smartwatch)
     {
    	 
    	 String s1=y1.getText();
    	 Thread.sleep(2000);
    	 if(s1.equals("smart tv"))
    		 Thread.sleep(2000);
    		 y1.click();
    		 Thread.sleep(2000);
    	 break;
     }
	
	
	
	}
}