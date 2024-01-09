package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test14 {

	//get position
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
			ChromeOptions co=new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			
			WebDriver driver=new ChromeDriver(co);
			
			//to enter url/open an application
			driver.get("https://www.meta.com/");
			
			        //wait 
					Thread.sleep(2000);
					
					//to get position of the browser
					Point k1=driver.manage().window().getPosition();	
}
}