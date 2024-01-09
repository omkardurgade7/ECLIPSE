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

public class With_DDF {
      public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
    	//step 1 open the browser
    	ChromeOptions GO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(GO);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//enter url
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		Thread.sleep(1000);
		
		//step 2 enter username
	    //to reach excel sheet
		FileInputStream RR=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		Sheet sh=WorkbookFactory.create(RR).getSheet("Sheet8");
		String username=sh.getRow(0).getCell(0).getStringCellValue();   //Omkar@12345
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(1000);
		
		//step 3 enter password
		String password=sh.getRow(1).getCell(0).getStringCellValue();    //Omkar@123
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
		
		//click on login button
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(1000);
		
		//Test case - Verify username
		//Expected username
	    String exname=sh.getRow(2).getCell(0).getStringCellValue();  //Omkar12345!
	    
	    //actual name
	   String s1=driver.findElement(By.xpath("//input[@value='Hello Omkar12345!']")).getAttribute("value"); //Hello Omkar12345!
	   
	   String g1[]=s1.split(" ");   //Hello    //Omkar12345!
	   
	   String w1=g1[0];//Hello
	   String actname=g1[1];//Omkar12345!
	   
	   System.out.println(w1);//Hello
	   System.out.println(actname);//Omkar12345!
	   
	   //compare expected username with actual username
	   
	   if(exname.equals(actname))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
		
	}
}
