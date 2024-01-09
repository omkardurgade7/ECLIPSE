package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		
		ChromeOptions CO=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("http://time-time.net/times/time-zones/usa-canada/usa-time-zone-map.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String time=driver.findElement(By.xpath("((//div[@id='location_utc'])//div)[1]")).getText();
		
		System.out.println(time);
		
	}
	
	
}
