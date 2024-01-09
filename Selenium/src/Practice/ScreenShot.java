package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
     
	public static void main(String[] args) throws IOException {
		
		ChromeOptions CO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(CO);
		
		driver.get("https://en.wikipedia.org/wiki/Avengers:_Endgame");
		driver.manage().window().maximize();
		
	WebElement	s1=driver.findElement(By.xpath("//table[@class='infobox vevent']"));
	    File avengers=s1.getScreenshotAs(OutputType.FILE);
	    
	    File endgame=new File("D:\\.avengers.jpg");
	    
	    FileHandler.copy(avengers, endgame);
	    
	
	}
}
