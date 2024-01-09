package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AlertPopup {
    
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions Co=new ChromeOptions();
		WebDriver driver=new ChromeDriver(Co);
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000); 
		
		Alert popup=driver.switchTo().alert();
		Thread.sleep(2000);
		popup.dismiss();
		Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		Thread.sleep(2000);
		
		Alert popup2=driver.switchTo().alert();
		Thread.sleep(2000);
		popup2.dismiss();
		
		*/
		
		
		
		
	}
}
