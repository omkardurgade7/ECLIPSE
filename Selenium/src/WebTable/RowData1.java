package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RowData1
{

	public static void main(String[] args) throws InterruptedException
	{
	   	 ChromeOptions CO=new ChromeOptions();
	     WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
	   	 Thread.sleep(2000);
	   	 
	   	 for(int i=1; i<=3; i++)
	   	 {
	   		WebElement text=driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']//tr[4]/td["+i+"]"));
	   		 String a1=text.getText();
	   		 System.out.print(a1+" ");
	   	 }
	   	 System.out.println();
	    	 
}
}