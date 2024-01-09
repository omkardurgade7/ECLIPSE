package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CurrentTime {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 
		 String time=driver.findElement(By.xpath("((//div[@id='qlook'])//span)[3]")).getText();
				 System.out.println(time);
}
}