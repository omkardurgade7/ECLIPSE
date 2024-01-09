package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{

	  @FindBy (xpath="//*[@id='login-revamp-click']") private WebElement LOGINBUTTON;
	  @FindBy (xpath="//*[@name='TxtEmailAddreg_lp']") private WebElement EMAIL;
	  @FindBy (xpath="//*[@name='TxtPasswordreg_lp']") private WebElement PASSWORD;
	  @FindBy (xpath="(//a[text()='Login'])[2]") private WebElement LOGIN;
	  
	  @FindBy (xpath="//span[@class='user-icon']") private WebElement PROFILE;
	  @FindBy (xpath="//a[text()='Logout']") private WebElement LOGOUT;
	  
	  public Login(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void clickloginbutton()
	  {
		  LOGINBUTTON.click();
	  }
	  
	  public void enteremail(String un)
	  {
		  EMAIL.sendKeys(un);
	  }
	  
	  public void enterpassword(String pass)
	  {
		  PASSWORD.sendKeys(pass);
	  }
	  
	  public void loginbutton()
	  {
		  LOGIN.click();
	  }
	  
	  public void clickprofilebutton()
	  {
		  PROFILE.click();
	  }
	  
	  public void clicklogoutbutton()
	  {
		  LOGOUT.click();
	  }
	  
}
