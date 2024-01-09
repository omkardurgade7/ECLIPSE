package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HndlngOFmltplElmnt {

	      public static void main(String[] args) throws InterruptedException {
			ChromeOptions CO=new ChromeOptions();
			WebDriver driver=new ChromeDriver(CO);
			
			driver.get("https://www.google.com/search?q=india&oq=india&aqs=chrome.0.0i131i355i433i512j46i131i433i512j69i64j46i131i199i433i465i512l4j0i433i512.68075j0j15&sourceid=chrome&ie=UTF-8");
			Thread.sleep(2000);
			
			List<WebElement> all=driver.findElements(By.xpath("//div"));
			Thread.sleep(2000);
			
			for(WebElement links:all)
			{
				String s1=links.getText();
				System.out.println(s1);
			}
		}
}
