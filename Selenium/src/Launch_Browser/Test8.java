package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test8 {
//getcurrenturl
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(co);
		
		//to enter url/open an application
		driver.get("https://www.vctcpune.com/");
		
		//to get  url
		String d1=driver.getCurrentUrl();
		System.out.println(d1);
		
	}
}
