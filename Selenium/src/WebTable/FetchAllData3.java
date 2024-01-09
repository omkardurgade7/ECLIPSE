package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchAllData3 {
      public static void main(String[] args) throws InterruptedException {
		
    	  ChromeOptions KO=new ChromeOptions();
    	  WebDriver driver=new ChromeDriver(KO);
    	  
    	  driver.manage().window().maximize();
    	  Thread.sleep(300);
    	  
    	  driver.get("https://qavbox.github.io/demo/webtable/");
    	  Thread.sleep(200);
    	  
    	  for(int i=1; i<=55; i++)
    	  {
    		  for(int d=1; d<=6; d++)
    		  {
    			  WebElement okay=driver.findElement(By.xpath("//table[@id='table02']//tr["+i+"]//td["+d+"]"));
    			  String data=okay.getText();
    			  System.out.print(data+" ");
    			  
    		  }
    		  System.out.println(); 
    	  }
    	  
      }
}
