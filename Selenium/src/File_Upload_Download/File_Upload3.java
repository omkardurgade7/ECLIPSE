package File_Upload_Download;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Upload3 {

	   public static void main(String[] args) throws AWTException {
		
		   ChromeOptions CO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(CO);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.sodapdf.com/pdf-to-word/");
		   
		   driver.findElement(By.xpath("(//label[@for='choose-file'])[1]")).click();
		   
		   StringSelection ss1=new StringSelection("D:\\Selenium\\framework explain & Role and responibilites (1) (1).pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		   
		   Robot robot=new Robot();
		   robot.delay(2000);
		   
		   Robot r1=new Robot();
		   r1.delay(2000);
		   
		   r1.keyPress(KeyEvent.VK_CONTROL);
		   r1.keyPress(KeyEvent.VK_V);
		   
		   r1.keyRelease(KeyEvent.VK_CONTROL);
		   r1.keyRelease(KeyEvent.VK_V);
		   
		   r1.keyPress(KeyEvent.VK_ENTER);
		   r1.keyRelease(KeyEvent.VK_ENTER);
		   
		   
		   
		   
	}
}
