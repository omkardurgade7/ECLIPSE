package AutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 {
       
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1.exe");
   	 ChromeOptions CO=new ChromeOptions();	 
   	 WebDriver driver=new ChromeDriver(CO);
   	 
   	 driver.get("https://www.amazon.com/");
   	 Thread.sleep(2000);
   	 
   	 driver.manage().window().maximize();
   	Thread.sleep(2000);
   	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nike");
   	 Thread.sleep(2000);
   	 
   	 List<WebElement> amazon=driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])//div"));  	 
   	 Thread.sleep(2000);
   	 
   	 for(WebElement nike:amazon)
   	 {
   		 String shoes=nike.getText();
   	
   		 if(shoes.equals("nike shoes men"))
   			 {
   			 nike.click();
   		     break;
   			 }
   	 }
   	
   	 
   	 
   	 
   	 
}
}