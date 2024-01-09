package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker2 {
       public static void main(String[] args) throws InterruptedException {
		
    	   ChromeOptions CO=new ChromeOptions();
    	   WebDriver driver=new ChromeDriver(CO);
    	   
    	   driver.manage().window().maximize();
    	   Thread.sleep(1000);
    	   
    	   driver.get("https://demo.automationtesting.in/Datepicker.html");
    	   Thread.sleep(1000);
    	   
    	   driver.findElement(By.xpath("//img[@class='imgdp']")).click();
    	   Thread.sleep(1000);
    	   
    	   String month="August 2023";
    	   String date="30";
    	   
    	   while(true)
    	   {
    		   String mm=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
    	   if(month.equals(mm))
    	   {
    		   break;
    	   }
    	   /*else
    	   {
    		   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    	   }*/
    	   }
    	   
    	   driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']//tr//td)[32]")).click();
    	   List<WebElement> dd=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
    	   for(WebElement okay:dd)
    	   {
    		   String s1=okay.getText();
    		   if(date.equals(s1))
    		   {
    			   okay.click();
    			   break;
    		   }
    	   }
    	   
    	   
	}
}
