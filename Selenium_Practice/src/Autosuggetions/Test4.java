package Autosuggetions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
{
	 public static void main(String[] args) throws IOException {
			
		  
		  ChromeOptions CO=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(CO);
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com/");
		  
		  driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("cwc");
		  
		  List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		  
		  for(WebElement kk:suggestions)
		  {
			  String s1=kk.getText();
			  
			  if(suggestions.equals("CWC"))
			  {
				  kk.click();
			  }
			  
		  }
		  
		  
}
}