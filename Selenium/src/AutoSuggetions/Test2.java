package AutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {
       
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
   	 ChromeOptions CO=new ChromeOptions();	 
   	 WebDriver driver=new ChromeDriver(CO);
   	
   	 //enter url
   	 driver.get("https://www.google.com/");
   	 Thread.sleep(2000);
   	 driver.manage().window().maximize();
   	 
   	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("avengers");
   	 Thread.sleep(2000);
   	 
   	 List<WebElement> avengers=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//div"));
   	 
   	 for(WebElement last:avengers)
   	 {
   		 String s1=last.getText();
   		 
   		 if(s1.equals("Avengers: Infinity War"))
   		 {
   			 last.click();
   			 break;
   		 }
   	 }
   	 
   	 
   	 
   	 
   	 
   	 
   	 
	}
}
