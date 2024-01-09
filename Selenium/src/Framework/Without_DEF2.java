package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DEF2 {

	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions XO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(XO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(1000);;
		   
		   driver.get("http://testphp.vulnweb.com/login.php");
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("test");
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//input[@value='login']")).click();
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//a[text()='home']")).click();
		   Thread.sleep(1000);
		   
		   //String expresult="";
		   
		   
		   
		   
		   
	}
	    
	
}
