package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GLobalSQA {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
   	 ChromeOptions CO=new ChromeOptions();	 
   	 WebDriver driver=new ChromeDriver(CO);
   	 
   	 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
   	 driver.manage().window().maximize();
   	 Thread.sleep(2000);
   	 
   	WebElement country=driver.findElement(By.xpath("//select"));
   	Thread.sleep(2000);
   	
   	Select ind=new Select(country);
   	Thread.sleep(2000);
   	ind.selectByVisibleText("India");
   	 
   	 
   	 
   	 
   	 
   	 
   	 
   	
}
}