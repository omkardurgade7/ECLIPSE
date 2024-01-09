package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class With_DDF1 {
	        public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	        {
	    	ChromeOptions EO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(EO);
	    	
	    	driver.manage().window().maximize();
	    	Thread.sleep(1000);
	    	
	    	driver.get("https://practicetestautomation.com/practice-test-login/");
	    	Thread.sleep(1000);
	    	
	    	FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
	    	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	    	String username=sh.getRow(0).getCell(0).getStringCellValue();
	    	
	    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	    	Thread.sleep(2000);
	    	
	    	String password=sh.getRow(1).getCell(0).getStringCellValue();
	    	
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("//button[@class='btn']")).click();
	    	Thread.sleep(2000);
	    	
	    	String expectedresult=sh.getRow(2).getCell(0).getStringCellValue();
	    	
	    	String actualresult=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).getText();
	    	
	    	if(expectedresult.equals(actualresult))
	    		{
	    		System.out.println("Pass");
	    		}
	    	else
	    	    {
	    		System.out.println("Fail");
	    	    }
		}
}
