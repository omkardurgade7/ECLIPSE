package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker4 {
     public static void main(String[] args) throws InterruptedException {
		
    	 ChromeOptions HO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(HO);
    	 
    	 driver.manage().window().maximize();
    	 Thread.sleep(1000);
    	 
    	 driver.get("https://fengyuanchen.github.io/datepicker/");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
    	 Thread.sleep(1000);
    	 
    	 String month="September 2023";
    	 String date="30";
    	 
    	 while(true)
    	 {
    		 String s1=driver.findElement(By.xpath("//li[text()='September 2023']")).getText();
    		 if(month.equals(s1))
    		 {
    			 break;
    		 }
    		 else
    		 {
    			 driver.findElement(By.xpath("//li[@data-view='month next']")).click();
    		 }
    	 }	 
    	List<WebElement> ddaattee=driver.findElements(By.xpath("//ul[@data-view='days']"));
    	for(WebElement dd:ddaattee)
    	{
    		String s1=dd.getText();
    		if(date.equals(s1))
    		{
    		dd.click();
    		break;
    		}
    	}
	}
}
