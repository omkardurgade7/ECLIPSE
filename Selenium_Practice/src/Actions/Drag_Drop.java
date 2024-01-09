package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop
{
   public static void main(String[] args) throws InterruptedException {
	
	   ChromeOptions co=new ChromeOptions();
	   WebDriver driver=new ChromeDriver(co);
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
	   
	   WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
	   
	   WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	   
	   Actions act=new Actions(driver);
	   Thread.sleep(2000);
	   
	   act.dragAndDrop(drag, drop).perform();
	   
	   
	   
	   
	   
}
}
