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

public class Test3 
{

	 public static void main(String[] args) throws IOException {
			
		  
		  ChromeOptions CO=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(CO);
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://en.wikipedia.org/wiki/Flag_of_India");
		  
		  WebElement okay=driver.findElement(By.xpath("//table[@class='infobox']//img"));
		  
		  File source=okay.getScreenshotAs(OutputType.FILE);
		  
		  File Dest=new File("E:\\selenium.india.jpg");
		  
		  FileHandler.copy(source, Dest);		  
		  
		  
}
}