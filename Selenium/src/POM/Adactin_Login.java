package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {

	
	//this class for login webpage
	
	 //POM Class-1
	//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation

	
	 @FindBy(xpath="//input[@id='username']")  
	 private WebElement UN;
	 @FindBy(xpath="//input[@id='password']")  
	 private WebElement psw;
	 @FindBy(xpath="//input[@id='login']")  
	 private WebElement loginbtn;
	 
	 //2. Initialize within a constructor with access level public using PageFactory Class
	 public Adactin_Login(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	//3. Utilize within a method with access level public
	 
	 public void enterUsername()
	  {
		  UN.sendKeys("Velocity");
	  }
	 
	 public void enterPassword()
	 {
		 psw.sendKeys("U1YP1G");
	 }
	 
	 public void clickloginbutton()
	 {
		 loginbtn.click();
	 }
	    
}
