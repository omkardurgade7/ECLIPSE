package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	    public static void main(String[] args) throws InterruptedException {
			
	    	ChromeOptions Co=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(Co);
	    	
	    	driver.manage().window().maximize();
	    	Thread.sleep(1000);
	    	
	    	driver.get("https://www.facebook.com/login/");
	    	Thread.sleep(1000);
	    	
	    	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	    	Thread.sleep(1000);
	    	
	    	WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
	    	Select dd=new Select(date);
	    	dd.selectByVisibleText("30");
	    	Thread.sleep(1000);
	    	
	    	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));	
	    	Select okay=new Select(month);	
	    	okay.selectByVisibleText("Sep");
	    	Thread.sleep(1000);
	    	
	    	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	    	Select yy=new Select(year);
	    	yy.selectByVisibleText("1999");
	    	
	    	driver.quit();
	    
		}
}