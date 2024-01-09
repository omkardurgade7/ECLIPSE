package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test1 {

	    public static void main(String[] args) throws IOException {
			
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.google.com/");
	    	
	    	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
	    	File dest=new File("E:\\java\src google.jpg");
	    	
	    	FileHandler.copy(source, dest);
	    	
	    	driver.quit();
		}
}
