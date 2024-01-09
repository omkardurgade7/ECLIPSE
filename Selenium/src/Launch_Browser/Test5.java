package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 {

//open app,wait,navigate
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	
		ChromeDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.navigate().to("https://paytm.com/");
		
		//wait
		Thread.sleep(2000);
		
		//to enter url/open an appliction
		driver.navigate().to("https://snapchat.com/");
		
		//wait
		Thread.sleep(2000);
		
		//to move backward
		driver.navigate().back();//paytm
		
		//wait
		Thread.sleep(2000);
		
		//to move forward
		driver.navigate().forward();//snapchat
		
		//wait
		Thread.sleep(2000);
		
		//to refresh webpage
		driver.navigate().refresh();
		
		//close
		driver.close();
		
		
		
		}
}
