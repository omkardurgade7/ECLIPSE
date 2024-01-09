package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker1 {
     public static void main(String[] args) throws InterruptedException {
		
    	 ChromeOptions CO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(CO);
    	 
    	 driver.manage().window().maximize();
    	 Thread.sleep(2000);
    	 
    	 driver.get("https://www.booking.com/");
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")).click();
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("//button[@class='d47738b911 e246f833f7 fe211c0731'][1]")).click();
    	 Thread.sleep(200);
    	
    	 //take two variables for monthndyear and data
    	 String MndY="September 2023";
    	 String date="30";
    	 
    	 //get actual month and year use while loop
    	 while(true)
    	 {
    		String monthndyear=driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[2]")).getText(); 
    		 //use if else condition
    		if(MndY.equals(monthndyear))
    		{
    			break;
    		}
    	/*
    		else  //to click  next arrow use else condition
    		{
    			driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 f671049264 deab83296e f4552b6561 dc72a8413c f073249358']")).click();
    		}*/
    	 }
    	 
    	 //get all the dates use findElements methods for date picking
    	 List<WebElement>  alldate=driver.findElements(By.xpath("(//table[@class='eb03f3f27f'])[2]//tr/td"));
    	 
    	 //use for each loop
    	 for(WebElement venue:alldate)
    	 {
    		 String hh=venue.getText();
    		 
    		 //use if condition for date select
    		 if(date.equals(hh))
    		 { 
    			 venue.click();
    		 break;
    		 }
    	 }
    	 
	}
}
