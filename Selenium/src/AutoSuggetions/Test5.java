package AutoSuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 {
       
	public static void main(String[] args) throws InterruptedException {
	
  	 ChromeOptions CO=new ChromeOptions();	 
  	 WebDriver driver=new ChromeDriver(CO);
  	 
  	 driver.get("https://www.asus.com/in/content/eshop-everyday-laptops/?gclid=Cj0KCQjw84anBhCtARIsAISI-xfVT400RVbw-8CEed0HCvc6EfAYOeGrNLfyCF_A-69IORaId9M4ZhwaAmG4EALw_wcB");
  	 Thread.sleep(2000);
  	 
  	 driver.manage().window().maximize();
  	 Thread.sleep(2000); 
  	 
  	 driver.findElement(By.xpath("//div[@aria-label='search']")).click();
  	 Thread.sleep(2000);
  	 
  	 driver.findElement(By.xpath("//input[@placeholder='Search ASUS.com']")).sendKeys("asus vivobook s15");
  	Thread.sleep(2000);
  	
  	List<WebElement> asus=driver.findElements(By.xpath("(//div[@class='HeaderSearchDropDownMenu__searchResultContainer__dGgeR HeaderSearchDropDownMenu__active__e5IKF'])//div"));
  	Thread.sleep(2000);
  	
  	for(WebElement vivobook:asus)
  	{
  		String laptop=vivobook.getText();
  		
  		if(laptop.equals("ASUS Vivobook S15 S530"))
  		{
  			vivobook.click();
  			break;
  		}
  	}
  	Thread.sleep(2000);
  	
  	driver.findElement(By.xpath("(//a[@target='_self'])[25]")).click();
  	
  	
  	 
  	 
  	 
}	
	}