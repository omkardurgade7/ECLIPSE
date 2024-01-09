package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker3 {

	
	    public static void main(String[] args) throws InterruptedException {
			
	    	ChromeOptions VO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(VO);
	    	
	    	driver.manage().window().maximize();
	    	Thread.sleep(2000);
	    	
	    	driver.get("https://demoqa.com/date-picker");
	    	Thread.sleep(1000);
	    	
	    	driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
	    	Thread.sleep(2000);
	    	
	    	String monthandyear="August 2023";
	    	String date="30";
	    	Thread.sleep(2000);
	    	while(true)
	    	{
	    		String month=driver.findElement(By.xpath("//div[text()='August 2023']")).getText();
	    		if(monthandyear.equals(month))
	    		{
	    			break;
	    		}
	    		
	    	/*	else
	    			Thread.sleep(2000);
	    		{
	    			driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
	    		}
	    		Thread.sleep(2000);*/
	    	}
	    	List<WebElement> dj=driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
	    	for(WebElement vin:dj)
	    	{
	    		Thread.sleep(2000);
	    		String uu=vin.getText();
	    		
	    		if(date.equals(uu))
	    			Thread.sleep(2000);
	    		{
	    			vin.click();
	    			break;
	    		}
	    	}
	    	
		}
}
