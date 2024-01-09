package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	    public static void main(String[] args) throws InterruptedException {
			
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    	
	    	WebElement date=driver.findElement(By.id("day"));
	    	Select dt=new Select(date);
	    	dt.selectByVisibleText("30");
	    	
	    	Thread.sleep(2000);
	    	WebElement month=driver.findElement(By.id("month"));
	    	Select mt=new Select(month);
	    	mt.selectByVisibleText("Sep");
	    	
	    	Thread.sleep(2000);
	    	WebElement year=driver.findElement(By.id("year"));    	
	    	Select yr=new Select(year);	
	    	yr.selectByVisibleText("1999");
	    	
		}
}
