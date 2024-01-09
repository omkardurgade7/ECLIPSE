package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions CO=new ChromeOptions();
	WebDriver driver=new ChromeDriver(CO);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://community.qlik.com/t5/QlikView-App-Dev/Listbox-to-select-the-columns-to-be-displayed/td-p/706369");
	Thread.sleep(2000);
	
	WebElement board=driver.findElement(By.xpath("(//select[@title='Search Granularity'])[3]"));
	Thread.sleep(2000);
	
	Select okay=new Select(board);
	Thread.sleep(2000);
	
	okay.selectByVisibleText("Users");
	
	
	
}
}