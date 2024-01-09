package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	    @FindBy(xpath="(//input[@class='login_input'])[1]") private WebElement username;
	    @FindBy(xpath="(//input[@class='login_input'])[2]") private WebElement password;
	    @FindBy(xpath="//input[@class='login_button']") private WebElement login;
	    
	    @FindBy(xpath="//*[text()='Logout']") private WebElement logout;
	    @FindBy(xpath="//a[text()='Click here to login again']") private WebElement againlogin;
	    
	    public Login(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void enterusername(String un)
	    {
	    	username.sendKeys(un);
	    }
	    
	    public void enterpassword(String psw)
	    {
	    	password.sendKeys(psw);
	    }
	    
	    public void clickloginbutton()
	    {
	    	login.click();
	    }
}
