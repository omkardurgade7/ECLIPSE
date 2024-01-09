package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class adactin_testclass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeOptions DO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(DO);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		Thread.sleep(1000);
		
		FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		adactin_login login=new adactin_login(driver);		
		String user=sh.getRow(0).getCell(0).getStringCellValue();		
		login.enterusername(user);		
		String pass=sh.getRow(1).getCell(0).getStringCellValue();
		login.enterpassword(pass);		
		login.clicklogin();
		
		adactin_welcome verify=new adactin_welcome(driver);
		String expectedusername=sh.getRow(2).getCell(0).getStringCellValue();
		verify.usernameverify(expectedusername);
		verify.logout();
		
		driver.quit();
		
				
		
		
		
	}
	
	
	   
}
