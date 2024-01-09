package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test12 {


	//get size
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.get("https://www.meta.com/");
		
		        //wait 
				Thread.sleep(2000);
				
				//create object of dimension class
				Dimension d1=new Dimension(400,700); //width and height
				
				//to get size of the browser
				Dimension q1=driver.manage().window().getSize();
				System.out.println(q1);
}
}
