package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	   public static void main(String[] args) {
		
		   ChromeOptions CO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(CO);
		   
		   driver.get("https://www.icicilombard.com/");
	}
}
