package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
       @FindBy(xpath="//input[@id='username']") private WebElement USERNAME;
       @FindBy(xpath="//input[@id='password']") private WebElement PASSWORD;
       @FindBy(xpath="//input[@id='login']") private WebElement LOGIN;
       
       public Login(WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
       
       public void enterun(String un)
       {
    	   USERNAME.sendKeys(un);
       }
       
       public void enterpsw(String psw)
       {
    	   PASSWORD.sendKeys(psw);
       }
       
       public void clicklgoin()
       {
    	   LOGIN.click();
       }
       
       
       
}
