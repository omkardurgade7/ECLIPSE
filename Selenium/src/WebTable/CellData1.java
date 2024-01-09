package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CellData1 {

	

	public static void main(String[] args) throws InterruptedException
	{
	   	 ChromeOptions CO=new ChromeOptions();
	     WebDriver driver=new ChromeDriver(CO);
	   	 
	   	 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	   	 
	   	 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
	   	 Thread.sleep(2000);
	   	                                                  //tbody[@style='box-sizing:inherit']//tr//td[1]
	   	 for(int i=1; i<=3; i++)                          //tbody[@style='box-sizing:inherit']//tr["+i+"]//td[1]
	   	 {                                                //tbody[@style='box-sizing:inherit']//tr["+i+"]//th[1]
	   		 WebElement data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]"));
	   		 String jj=data.getText();
	   		 System.out.println(jj);
	   	 }
	
	}
}
