package IsEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 
{
     public static void main(String[] args) {
		
    	 ChromeOptions CO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(CO);
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.w3.org/WAI/ARIA/apg/patterns/checkbox/examples/checkbox/");
    	 
    	 WebElement okay=driver.findElement(By.xpath("(//div[@role='checkbox'])[1]"));
    	 
    	 boolean s1=okay.isSelected();
    	 
    	 System.out.println(s1);
    	 
	}
}
