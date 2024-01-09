package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_2nd_Way
{

	   public static void main(String[] args)
	   {
		
		   
		   ChromeOptions Co=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(Co);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.cricbuzz.com/");
		   
		   //identify element upto we have to scroll and store into one object
		   
		   WebElement h1=driver.findElement(By.xpath("//div[text()='MOBILE SITE & APPS']"));
		   
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",h1); 
		   
		   
		   
	}
}
