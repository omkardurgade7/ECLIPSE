package Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {

	
	public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions SO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(SO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.get("https://demoqa.com/alerts");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		   
		   Thread.sleep(1000);
		   
		   Alert alt=driver.switchTo().alert();
		   
		   alt.accept();
}
}