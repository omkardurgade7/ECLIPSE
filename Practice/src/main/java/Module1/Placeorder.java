package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Placeorder {

	
	    @FindBy(xpath="//a[@class='action showcart']") private WebElement cart;
	    @FindBy(xpath="//button[@id='top-cart-btn-checkout']") private WebElement checkout;
	    @FindBy(xpath="//span[text()='New Address']") private WebElement newaddress;
	    @FindBy(xpath="//input[@name='firstname']") private WebElement fname;
	    @FindBy(xpath="//input[@name='lastname']") private WebElement lname;
	    @FindBy(xpath="//input[@name='company']") private WebElement company;
	    @FindBy(xpath="//input[@name='street[0]']") private WebElement adress;
	    @FindBy(xpath="//input[@name='city']") private WebElement city;
	    @FindBy(xpath="(//select[@class='select'])[1]") private WebElement state;
	    @FindBy(xpath="//input[@name='postcode']") private WebElement postalcode;
	    @FindBy(xpath="(//select[@class='select'])[2]") private WebElement country;
	    @FindBy(xpath="//input[@name='telephone']") private WebElement number;
	    @FindBy(xpath="//button[@class='action primary action-save-address']") private WebElement shiphere;
	    @FindBy(xpath="//main[@id='maincontent']") private WebElement method;
	    @FindBy(xpath="//span[text()='Next']") private WebElement next;
	    @FindBy(xpath="//input[@name='billing-address-same-as-shipping']") private WebElement checkbox;
	    @FindBy(xpath="//span[text()='Place Order']") private WebElement placeorder;
	    
	    public Placeorder(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    public void clickcart()
	    {
	    	cart.click();
	    }
	    public void clickcheckout()
	    {
	    	checkout.click();
	    }
	    public void clickaddress()
	    {
	    	newaddress.click();
	    }
	    public void enterfirstname(String name)
	    {
	    	fname.sendKeys(name);
	    }
	    public void enterlastname(String lastn)
	    {
	    	lname.sendKeys(lastn);
	    }
	    public void entercompany(String cmpny)
	    {
	    	company.sendKeys(cmpny);
	    }
	    public void enteraddress(String adrs)
	    {
	    	adress.sendKeys(adrs);
	    }
	    public void entercity(String ct)
	    {
	    	city.sendKeys(ct);
	    }
	    public void selectstate(String stt)
	    {
	    	Select s1=new Select(state);
	    	s1.selectByVisibleText(stt);
	    }
	    public void enterpostalcode(String pcode)
	    {
	        postalcode.sendKeys(pcode);	
	    }
	    public void selectcountry(String cntry)
	    {
	    	Select d1=new Select(country);
	    	d1.selectByVisibleText(cntry);
	    }
	    public void enternumber(String no)
	    {
	    	number.sendKeys(no);
	    }
	    public void clickshiphere()
	    {
	    	shiphere.click();
	    }
	    public void clickshippingmethod()
	    {
	    	method.click();
	    }
	    public void clicknext()
	    {
	    	next.click();
	    }
	    public void clickcheckbox()
	    {
	    	checkbox.click();
	    }
	    public void clickplaceorder()
	    {
	    	placeorder.click();
	    }
	    
	    
	    
}
