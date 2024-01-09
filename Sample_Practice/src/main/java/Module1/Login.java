package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
        @FindBy(xpath="(//input[@class='input_error form_input'])[1]") private WebElement USERNAME;
        @FindBy(xpath="(//input[@class='input_error form_input'])[2]") private WebElement PASSWORD;
        @FindBy(xpath="//input[@type='submit']") private WebElement LOGIN;
        
        public Login (WebDriver driver)
        {
        	PageFactory.initElements(driver, this);
        }
        
        public void enterusername(String un)
        {
        USERNAME.sendKeys(un);	
        }
        
        public void enterpassword(String psw)
        {
        	PASSWORD.sendKeys(psw);
        }
        
        public void clickbutton()
        {
        	LOGIN.click();
        }
        
        
}
