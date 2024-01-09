package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	
		ChromeDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.instagram.com/");
		
		driver.close();
		
		}
}
