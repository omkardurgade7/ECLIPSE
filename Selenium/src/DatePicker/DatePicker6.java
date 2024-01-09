package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker6 {
    public static void main(String[] args) throws InterruptedException {
		 
    	ChromeOptions SO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(SO);
    	
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	
    	driver.get("https://www.booking.com/");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//button[@class='d47738b911 e246f833f7 fe211c0731'][1]")).click();
        Thread.sleep(1000);
        
        String month="December 2023"; 
        String date="31";
        
        while(true)
        {
        	String qq=driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[2]")).getText();
        	if(month.equals(qq))
        	{
        		break;
        	}
        	else
        	{
        		driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 f671049264 deab83296e f4552b6561 dc72a8413c f073249358']")).click();
        	}
        }
        
        List<WebElement> djdj=driver.findElements(By.xpath("(//table[@class='eb03f3f27f'])[2]//tr/td"));
        
        for(WebElement zz:djdj)
        {
        	String s1=zz.getText();
        	if(date.equals(s1))
        	{
        		zz.click();
        		break;
        	}
        }
        
    	
	}
}  
