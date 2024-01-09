package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 
{
  public static void main(String[] args) {
	
	  ChromeOptions co=new ChromeOptions();
	  WebDriver driver=new ChromeDriver(co);
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p=current+time+in+usa");
	  
	  WebElement time=driver.findElement(By.xpath("(//div[@class='dd Time']//td)[2]"));
	  
	  String s1=time.getText();
	  
	  System.out.println(s1);
	  
	  
}
}
