package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test16 
{
     public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	 FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\Desktop\\TEST CASES-3.xlsx");
    	 
    	 String gg=WorkbookFactory.create(file).getSheet("YOUTUBE").getRow(196).getCell(6).getStringCellValue();
    	 
    	 System.out.println(gg);
    	 
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.google.com/");
    	 
    	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(gg);
    	 
    	 Actions act=new Actions(driver);
    	 
    	 act.sendKeys(Keys.ENTER).perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
