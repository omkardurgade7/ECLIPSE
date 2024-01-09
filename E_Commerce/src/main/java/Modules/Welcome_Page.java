package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page 
{
    @FindBy(xpath="//p[text()='Welcome, mahesh bhatt! ']") private WebElement VFNAME;
    @FindBy(xpath="(//span[text()='Account'])[1]") private WebElement ACCOUNT;
    @FindBy(xpath="//a[text()='Log Out']") private WebElement LOGOUT;
    @FindBy(xpath="(//span[@class='label'])[3]") private WebElement ACCOUNT2;
    @FindBy(xpath="//a[@title='Log In']") private WebElement LOGIN;
    
    public Welcome_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String verify()
    {
    	String actual=VFNAME.getText();
    	return actual;
    }
    
    public void clickaccount()
    {
    	ACCOUNT.click();
    }
    
    public void clicklogout()
    {
    	LOGOUT.click();
    }
    
    public void clickaccounnt2()
    {
    	ACCOUNT2.click();
    }
    
    public void clicklogin()
    {
    	LOGIN.click();
    }
}


