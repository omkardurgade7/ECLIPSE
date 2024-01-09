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
public class File_Upload1 {
	public static void main(String[] args) throws AWTException 
	{
		ChromeOptions co=new ChromeOptions();
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		//step 1 copy file from file to clipboard
		StringSelection s1=new StringSelection("E:\\omkar\\CV\\CV.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		//step 2 press control key and press v key
		Robot r1=new Robot();
		r1.delay(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		//Release CTRL and V key
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		//press enter key and release enter key
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);	
	}
}
