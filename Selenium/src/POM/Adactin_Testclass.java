package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Testclass {


	     public static void main(String[] args) throws InterruptedException {
			//open browser
	    	ChromeOptions CO=new ChromeOptions();
			WebDriver driver=new ChromeDriver(CO);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);;
			//open the application
			driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			Thread.sleep(2000);
			
			//create a object of POM class-1
			Adactin_Login login=new Adactin_Login(driver);
			
			 //Create Object of POM Class-I
			
			Adactin_Login Login=new Adactin_Login(driver);
			
			Login.enterUsername();
			
			Login.enterPassword();
			
			Login.clickloginbutton();
			
			//Create Object of POM Class-II
			
			Adactin_Welcome_Homepage Homepage=new Adactin_Welcome_Homepage(driver);
			
			Homepage.getUsername();
			
			Homepage.clicklogoutbutton();
				
	
			
		}
	    
}
