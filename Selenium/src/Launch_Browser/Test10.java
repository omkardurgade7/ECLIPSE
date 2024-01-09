package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test10 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.get("https://www.twitter.com/");
		
		        //wait 
				Thread.sleep(2000);
				
				//to maximize browser
				driver.manage().window().minimize();
				
}
}