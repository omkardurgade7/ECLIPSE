package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test13 {

	
	//Set position
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.get("https://www.meta.com/");
		
		        //wait 
				Thread.sleep(2000);
				
				//create object of point class
				
				Point p1=new Point(100,200); //XY
				
				//to change position of the browser
				driver.manage().window().setPosition(p1);
}
}