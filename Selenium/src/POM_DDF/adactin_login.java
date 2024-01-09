package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin_login {


	   @FindBy(xpath="//input[@name='username']") WebElement username;
	   @FindBy(xpath="//input[@name='password']") WebElement password;
	   @FindBy(xpath="//input[@name='login']")    WebElement login;
	   
	   adactin_login(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void enterusername(String user)
	   {
		   username.sendKeys(user);
	   }
	   public void enterpassword(String pass)
	   {
		   password.sendKeys(pass);
	   }
	   public void clicklogin()
	   {
		   login.click();
	   }
	   
	   
	   
	   
	   
}
