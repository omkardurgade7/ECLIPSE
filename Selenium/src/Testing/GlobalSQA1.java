package Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQA1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
   	 ChromeOptions CO=new ChromeOptions();	 
   	 WebDriver driver=new ChromeDriver(CO);
   	 
   	 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
   	 Thread.sleep(2000);
   	 
   	 driver.manage().window().maximize();
   	 Thread.sleep(2000);
   	
   	 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
   	 Thread.sleep(2000);
   	 
   	 driver.manage().window().maximize();
   	 Thread.sleep(2000);
   	 
   	 Alert alt=driver.switchTo().alert();
   	 
   	 alt.accept();
   	
}
}