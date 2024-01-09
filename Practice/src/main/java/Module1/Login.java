package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	  @FindBy(xpath="(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]") private WebElement signinbutton;
	  @FindBy(xpath="//input[@name='login[username]']") private WebElement EMAIL;
	  @FindBy(xpath="//input[@name='login[password]']") private WebElement PASSWORD;
	  @FindBy(xpath="//button[@class='action login primary']") private WebElement SIGNIN; 
	  
	  public Login(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  public void clicksi()
	  {
		  signinbutton.click();
	  }
	  public void enteremail(String mail)
	  {
		  EMAIL.sendKeys(mail);
	  } 
	  public void enterpassword(String pass)
	  {
		  PASSWORD.sendKeys(pass);
	  }
	  public void clicksignin()
	  {
		  SIGNIN.click();
	  }
	
}
