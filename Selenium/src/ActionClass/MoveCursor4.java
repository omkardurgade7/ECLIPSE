package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor4 {
     
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
	   	 ChromeOptions CO=new ChromeOptions();	 
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	   	 Thread.sleep(2000);
	   	 
	   	 driver.manage().window().maximize();
	   	 
	   	 WebElement move=driver.findElement(By.xpath("(//a[text()='Free Ebooks'])[1]"));
	   	 //Thread.sleep(2000);
	   	
	   	 Actions cursor=new Actions(driver);
	   	 
	   	 cursor.moveToElement(move).perform();
	   	 
	   	 
	   	 
}
}