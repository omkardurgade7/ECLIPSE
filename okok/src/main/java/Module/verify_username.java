package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verify_username {

	
	    @FindBy(xpath="") private WebElement actualun;
	
	    @FindBy(xpath="//a[text()='Logout']") private WebElement LOGOUTBUTTON;
	    @FindBy(xpath="//*[text()='Click here to login again']") private WebElement AGAINLOGIN;
	    
	    public verify_username(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public String getactualusername() 
	    {
	    	String actual=actualun.getText();
	    	
	    	return actual;
	    }
	    
	    public void logout()
	    {
	    	LOGOUTBUTTON.click();
	    }
	    
	    public void againlogin()
	    {
	    	AGAINLOGIN.click();
	    }
	    
	    
}
