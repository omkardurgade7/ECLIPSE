package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivPopup1 {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
          
		 driver.get("https://vctcpune.com/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@id='outlined-basic'])[1]")).sendKeys("Naruto Uzumaki");
		 
		 driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("narutouzumaki07@gmail.com");
		 
		WebElement course=driver.findElement(By.xpath("//select[@name='course']"));
		
		Select c1=new Select(course);
		
		Thread.sleep(2000);
		
		c1.selectByValue("Software Testing");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
}
}