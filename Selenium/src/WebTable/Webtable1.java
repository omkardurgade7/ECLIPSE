package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable1 {
     public static void main(String[] args) throws InterruptedException {
		
    	 ChromeOptions CO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(CO);
    	 
    	 driver.manage().window().maximize();
    	 Thread.sleep(2000);
    	 
    	 driver.get("https://omayo.blogspot.com");
    	 Thread.sleep(2000);
    	 
    	 //to find row size
    	 //find relative xpath of rows
    	 
    	 //Step-I : Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
    	 //Step-II: Highlight All Rows (use //tr)---->//table[@id='table1']//tr

    	List<WebElement> rowsize=driver.findElements(By.xpath("//table[@id='table1']//tr"));
    	
    	int s1=rowsize.size();
    	
    	System.out.println(s1);
    	
    	
    	
	}
}
