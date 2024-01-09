package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	 @FindBy(xpath="(//input[@type='email'])[1]") private WebElement EMAIL;
     @FindBy(xpath="//input[@type='password']") private WebElement PASSWORD;
     @FindBy(xpath="(//button[@type='submit'])[2]") private WebElement LOGIN;
     
     public Login(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);    	 
     }
     
     public void enteremail(String mail)
     {
    	 EMAIL.sendKeys(mail);
     }
     
     public void enterpassword(String pass)
     {
    	 PASSWORD.sendKeys(pass);
     }
     
     public void clicklogin()
     {
    	 LOGIN.click();
     }

     
     
}
