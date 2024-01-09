package Dropdown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test12 
{
      public static void main(String[] args) {
		
    	  
    	  WebDriver driver=new ChromeDriver();
    	  
    	  driver.manage().window().maximize();
    	  
    	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    	  
    	  WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
    	  Select okay=new Select(day);
    	  okay.selectByVisibleText("30");
    	  
    	  WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
    	  Select no=new Select(month);
    	  no.selectByVisibleText("Sep");
    	  
    	  WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
    	  Select dj=new Select(year);
    	  dj.selectByVisibleText("1999");
    	  
    	  String s1=driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']")).getText();
    	  
    	  System.out.println(s1);
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
