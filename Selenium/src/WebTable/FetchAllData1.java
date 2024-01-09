package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchAllData1 {

	
	public static void main(String[] args) throws InterruptedException {
		
	   	 ChromeOptions CO=new ChromeOptions();
	   	 WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://omayo.blogspot.com");
	   	 Thread.sleep(2000);
	   	 
	   	 //take outer for loop for rows
	   	 for(int i=1; i<=4;/*row size*/ i++)
	   	 {
	   		//take inner for loop for cells
	   		 for(int a=1; a<=3;/*cell size*/ a++)
	   		 {
	   			//highlight table-->highlight all rows-->
	   			 
	   			 WebElement a1=driver.findElement(By.xpath("//table[@id='table1']//tr["+i+"]/td["+a+"]"));
	   			 String all=a1.getText();
	   			 System.out.print(all+" ");
	   		 }
	   		 System.out.println();
	   	 }
	
	   	 
	   	 
}
}