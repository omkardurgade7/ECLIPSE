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

public class With_DDF3 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	    ChromeOptions AO=new ChromeOptions();
	    WebDriver driver=new ChromeDriver(AO);
	    
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    driver.get("https://practice.expandtesting.com/login");
	    Thread.sleep(1000);
	    
	    //enter username get it from excel sheet
	    FileInputStream dj=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
	    Sheet sh=WorkbookFactory.create(dj).getSheet("Sheet3");
	    String username=sh.getRow(0).getCell(0).getStringCellValue();
	    
	    //enter username
	    driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(username);
	    Thread.sleep(2000);
	    
	    //get password from excelsheet
	   String password=sh.getRow(1).getCell(0).getStringCellValue();
	   
	   //enter password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//button[text()='Login']")).click();
	   Thread.sleep(2000);
	   
	   //get expected result from excelsheet 
	  String expectedresult=sh.getRow(2).getCell(0).getStringCellValue();
	  
	  //get actual result from webpage
	  String actualresult=driver.findElement(By.xpath("//h4[@class='subheader']")).getText();
	  
	  //use if else condtion for chrcking expectedresult=actualresult
	  
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