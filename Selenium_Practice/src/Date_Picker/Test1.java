package Date_Picker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
     public static void main(String[] args) throws InterruptedException 
     {
		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.trivago.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='flex items-center 2xl:p-2 2xl:hover:bg-grey-200 2xl:rounded-md group-focus:ring-2 group-focus:ring-blue-700 group-focus:ring-inset'])[1]")).click();
		Thread.sleep(2000);
		
		String expectedmndyr="October 2023";
		String expecteddate="27";
		
		while(true)
		{
			String actmonthndyr=driver.findElement(By.xpath("//*[text()='October 2023']")).getText();
			Thread.sleep(2000);
			if(expectedmndyr.equals(actmonthndyr))
			{
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[@class='leading-none inline-flex transform'])[5]")).click();
			}
			
		}		
    	 List<WebElement> alldates=driver.findElements(By.xpath("(//div[@class='grid grid-cols-7  CalendarMonth_scrollWrapper__wErGe px-5 pt-2 gap-y-1'])[1]//button"));
    	 Thread.sleep(2000);
    	 for(WebElement dd:alldates)
    	 {
    		 String actualdate=dd.getText();
    		 if(expecteddate.equals(actualdate))
    		 {Thread.sleep(2000);
    			 dd.click();
    			 break;
    		 }
    	 }
    	 
    	 
	}
}
