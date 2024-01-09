package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframe {
     public static void main(String[] args) throws InterruptedException {
		
    	 ChromeOptions CO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(CO);
    	 
    	 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
    	 Thread.sleep(2000);
    	 
    	 driver.switchTo().frame("iframeResult");
    	 Thread.sleep(2000);
    	 
    	 
	}
}
