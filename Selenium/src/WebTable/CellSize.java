package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CellSize {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		
		List<WebElement> data=driver.findElements(By.xpath("//tbody[@style='box-sizing:inherit']//th"));
		Thread.sleep(2000);
		
		int cell=data.size();
		System.out.println(cell);
		
	}
}
