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

public class File_Upload2 {

	
	
	 public static void main(String[] args) throws AWTException {
		
		 ChromeOptions CO=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://smallpdf.com/jpg-to-pdf");
		 
		 driver.findElement(By.xpath("//button[@class='l3tlg0-0 ggoliT']")).click();
		 
		 //copy the file 
		 StringSelection copy=new StringSelection("D:\\null.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);
		 
		 //press control and v key
		 Robot t1=new Robot();
		 t1.delay(2000);
		 
		 t1.keyPress(KeyEvent.VK_CONTROL);
		 t1.keyPress(KeyEvent.VK_V);
		 
		 //release ctrl and v key
		 t1.keyRelease(KeyEvent.VK_CONTROL);
		 t1.keyRelease(KeyEvent.VK_V);
		 
		 //press enter key and release enter key
		 t1.keyPress(KeyEvent.VK_ENTER);
		 t1.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
	}
}
