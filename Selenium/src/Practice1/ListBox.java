package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	
	
	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions SO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(SO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.get("http://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Omkar12345");
		   
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Omkar@123");

		   driver.findElement(By.xpath("//input[@id='login']")).click();
		   
		   WebElement location=driver.findElement(By.xpath("//select[@name='location']"));
		   
		   Select loc=new Select(location);
			
		   loc.selectByVisibleText("London");   
				   
		   WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		   
		   Select hotels=new Select(hotel);
		   
		   hotels.selectByVisibleText("Hotel Sunshine");
		   
		   

	}
}
