package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchAllData2 {
    public static void main(String[] args) throws InterruptedException {
		
    	ChromeOptions CO=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(CO);
    	
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	
    	driver.get("https://nxtgenaiacademy.com/webtable/");
    	Thread.sleep(1000);
    	
    	for(int i=1; i<=9; i++)
    	{
    		for(int a=1; a<=2; a++)
    		{
    			WebElement table=driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[1]//tr["+i+"]//td["+a+"]"));
    			String data=table.getText();
    			System.out.print(data+" ");
    		}
    		System.out.println();
    	}	
	}
}
