package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions CO=new ChromeOptions();
	WebDriver driver=new ChromeDriver(CO);
	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement dj=driver.findElement(By.xpath("//select[@id='course']"));
	Thread.sleep(2000);
	Select hh=new Select(dj);
	Thread.sleep(2000);
	hh.selectByVisibleText("Java");
	Thread.sleep(2000);
	
	WebElement IDE=driver.findElement(By.xpath("//select[@id='ide']"));
	Select ii=new Select(IDE);
	ii.selectByVisibleText("Eclipse");
	
	
	
	}
}
