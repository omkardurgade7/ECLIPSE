package Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2
{
   public static void main(String[] args) throws InterruptedException {
	

		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		Thread.sleep(1000);
		
		String expectedmonth="October";
		String expecteddate="31";
		Thread.sleep(2000);
		
		
		while(true)
		{
			String actualmonth=driver.findElement(By.xpath("//span[text()='October']")).getText();
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			if(expecteddate.equals(actualmonth))
			{
				Thread.sleep(2000);
				break;				
			}	
		}
		List<WebElement >actualdate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr//a"));
		for(WebElement date:actualdate)
		{
			Thread.sleep(2000);
			String s1=date.getText();
			Thread.sleep(2000);
			if(expecteddate.equals(actualdate))
			{
				Thread.sleep(2000);
				date.click();
				Thread.sleep(2000);
				break;
			}
			
			
		}
}
}
