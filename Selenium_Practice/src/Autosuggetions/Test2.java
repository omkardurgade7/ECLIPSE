package Autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

	   public static void main(String[] args) throws InterruptedException {
		
		  ChromeOptions CO=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(CO);
		  
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  driver.get("https://www.google.com/");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//*[@jsname='yZiJbe']")).sendKeys("avengers");
		  Thread.sleep(1000);
		  
		  List<WebElement> ee=driver.findElements(By.xpath("//li[@class='sbct sbre']"));
		  Thread.sleep(1000);
		  
		  for(WebElement jj:ee)
		  {
			  String s1=jj.getText();
			  Thread.sleep(1000);
			  if(s1.equals("The Avengers"))
			  {Thread.sleep(1000);
				  jj.click();
				  break;
			  }
		  }
	}
}
