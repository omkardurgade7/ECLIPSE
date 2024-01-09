package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_down 
{
   public static void main(String[] args) throws InterruptedException {
	
	   ChromeOptions Co=new ChromeOptions();
	   WebDriver driver=new ChromeDriver(Co);
	   
	   driver.manage().window().maximize();
	   	   
	   driver.get("https://www.youtube.com/");
	   
	   Thread.sleep(2000);
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	   
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	   
	   
	   
}
}
