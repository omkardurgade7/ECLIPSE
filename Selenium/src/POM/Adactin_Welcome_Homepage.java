package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Welcome_Homepage {

	
	//this class for after login welcome homepage
	//POM Class-II
	
		//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation

	 @FindBy(xpath="//input[@name='username_show']")
	 private WebElement UserShow;
	 @FindBy(xpath="//a[text()='Logout']")
	 private WebElement LogoutBtn;
	
	 //2. Initialize within a constructor with access level public using PageFactory Class 
	 
	  Adactin_Welcome_Homepage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	//3. Utilize within a method with access level public
	  
	  public void getUsername()
	  {
		  String s1=UserShow.getAttribute("value");
		  
		  String a1[]=s1.split(" ");
		  
		  String z1=a1[0];
		  String z2=a1[1];
	  }
	
	  public void clicklogoutbutton()
	  {
		  LogoutBtn.click();
	  }
	
}
