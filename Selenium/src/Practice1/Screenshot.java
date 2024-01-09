package Practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	    public static void main(String[] args) throws InterruptedException, IOException {
			ChromeOptions VO=new ChromeOptions();
			WebDriver driver=new ChromeDriver(VO);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("https://www.airindia.com/");
			Thread.sleep(1000);
			          
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File Dest=new File("E:\\java.sample.jpg");
			
			FileHandler.copy(source, Dest);
			
		}
}
