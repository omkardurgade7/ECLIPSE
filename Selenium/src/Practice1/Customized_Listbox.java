package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Customized_Listbox {

	

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
		   
		   driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]")).click();
		   
		   Actions act=new Actions(driver);
		   
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   act.sendKeys(Keys.ENTER).perform();
		   
		   WebElement selecthotel=driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		   act.moveToElement(selecthotel).perform();
		   
		   act.click().perform();
		   
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   act.sendKeys(Keys.ENTER).perform();
		   
		   
}
}
