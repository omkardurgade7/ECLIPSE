package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivPopup {

	
public static void main(String[] args) throws InterruptedException {
	  ChromeOptions CO=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(CO);
	  
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("(//input[@id='outlined-basic'])[1]")).sendKeys("hello");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("hello@123");
	  Thread.sleep(2000);
	  
	 WebElement course=driver.findElement(By.xpath("//select[@name='course']"));
	 
	 Select vctc=new Select(course);
	 vctc.selectByVisibleText("Software Testing");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();
	  
	  
	
	
	
}
}