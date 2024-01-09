package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatePicker7 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions VO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(VO);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@role='searchbox'][1]")).sendKeys("Miraj");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Goa");
		Thread.sleep(1000);
		
		WebElement classes=driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
        act.click(classes).perform();
        Thread.sleep(1000);
        
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(1000);
		
		String month="September2023";
		String date="30";
		
		while(true)
		{
			String dd=driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']")).getText();
			if(month.equals(dd))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			}
		}
		
		List<WebElement> cc=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']/tbody/tr/td/a"));
		for(WebElement zz:cc)
		{
			String d1=zz.getText();
			if(date.equals(d1))
			{
				zz.click();
				break;
			}
		}
		Thread.sleep(1000);
		

        WebElement general=driver.findElement(By.xpath("//span[@class='ng-tns-c65-12 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
		Actions tca=new Actions(driver);
		tca.click(general).perform();
		Thread.sleep(1000);
		tca.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
	
			
	}
}
