package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions CO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(CO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		   
		   driver.get("https://24timezones.com/Japan/time");
		   Thread.sleep(1000);
		   
		   WebElement time=driver.findElement(By.xpath("//div[@class='infoRow']//p//strong//span"));
		   Thread.sleep(1000);
		   
		   String hmm=time.getText();
		   System.out.println(hmm);
		   Thread.sleep(1000);
		   
		   driver.close();
		   
	}
}
