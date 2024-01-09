package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 
{
   public static void main(String[] args) throws IOException {
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.google.com/");
	   
	   WebElement ss=driver.findElement(By.xpath("//a[text()='मराठी']"));
	   
	   File source=ss.getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("E:\\ screenshot.jpg");
	   
	   FileHandler.copy(source, dest);
	   
	   driver.quit();
	   
}
}
