package Scroll;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_UpDown {

	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions CO=new ChromeOptions();
		   WebDriver driver =new ChromeDriver(CO);
		   
		   driver.manage().window().maximize();
		   driver.get("https://github.com/operasoftware/operachromiumdriver/releases");
		   
		   //Scroll down 2nd parameter +ve pixel value
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000)");
		   
		   Thread.sleep(2000);
		   
		   //Scroll up second parameter -ve pixel value
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -500)");
		   
	}
}
