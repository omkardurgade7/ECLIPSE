package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
     public static void main(String[] args) {
		
    	 //System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
    	 
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.get("https://www.google.com");
	}
}
