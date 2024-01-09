package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test2 {

	  public static void main(String[] args) throws IOException {
		
		  
		  ChromeOptions CO=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(CO);
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com/");
		  
		  WebElement ss=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
		  
		  File source=ss.getScreenshotAs(OutputType.FILE);
		  
		  File dest=new File("E:\\Notepad samplle.jpg");
		  
		  FileHandler.copy(source, dest);
	}
}
