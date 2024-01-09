package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Get_Quote 
{
   @FindBy(xpath="//a[text()='Products']") private WebElement PRODUCTS; 
   @FindBy(xpath="//a[text()='Health AdvantEdge']") private WebElement HEALTHADVANNTAGE;
   @FindBy(xpath="(//a[text()='+'])[1]") private WebElement ADD;
   @FindBy(xpath="//div[@id='adultDob1']") private WebElement DAY;  //(//input[@class='jq-dte-day Numeric hint'])[1]
   @FindBy(xpath="(//input[@class='jq-dte-month Numeric hint'])[1]") private WebElement MONTH;
   @FindBy(xpath="(//input[@class='jq-dte-year Numeric hint'])[1]") private WebElement YEAR;
   @FindBy(xpath="(//a[text()='Done'])[1]") private WebElement DONE;
   @FindBy(xpath="//input[@id='chi-landing-pincode']") private WebElement PINCODE;
   @FindBy(xpath="(//div[@class='submit-btn'])[1]") private WebElement QUOTE;
   @FindBy(xpath="//span[text()='₹7,331']") private WebElement PREMIUM;
   
   public Get_Quote(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void clickproducts()
   {
	   PRODUCTS.click();
   }
   
   public void clickhealth()
   {
	   HEALTHADVANNTAGE.click();
   }
   public void clickadd()
   {
	   ADD.click();
   }
   public void enterday(String day)
   {
	   DAY.sendKeys(day);
   }
   public void entermonth(String month)
   {
	   MONTH.sendKeys(month);
   }
   public void enteryear(String year)
   {
	   YEAR.sendKeys(year);
   }
   public void clickdone()
   {
	   DONE.click();
   }
   public void enterpincode(String pincode)
   {
	   PINCODE.sendKeys(pincode);
   }
   public void clickquote()
   {
	   QUOTE.click();
   }
   public void verify(String expectedamount)
   {
	   String actualamount=PREMIUM.getText();
	   
	   Assert.assertEquals(actualamount, expectedamount);
   }
   
   
   
}
