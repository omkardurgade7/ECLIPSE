package Practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
     public static void main(String[] args) throws InterruptedException, IOException {
		
    	 ChromeOptions DO=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(DO);
    	
    	 
    	 driver.manage().window().maximize();
    	 Thread.sleep(1000);
    	 
    	 driver.get("https://www.youtube.com/");
    	 Thread.sleep(1000);
    	 
    	 WebElement yt=driver.findElement(By.xpath("(//div[@class='style-scope ytd-masthead'])[5]"));
    	 
    	 File Source=yt.getScreenshotAs(OutputType.FILE);
    	 
    	 File dest=new File("E:\selenium.yt.jpg");
    	 
    	 FileHandler.copy(Source, dest);
    	 
    	 
    	 
    	 
    	 
    			 
	}
}
