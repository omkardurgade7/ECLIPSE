package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Product 
{
	 @FindBy(xpath="(//a[text()='Men'])[1]") private WebElement MEN;
     @FindBy(xpath="//a[@href='https://ecommerce.tealiumdemo.com/men.html?cat=15']") private WebElement SHIRT;
     @FindBy(xpath="//img[@id='product-collection-image-404']") private WebElement COTTONSHIRT;
     @FindBy(xpath="(//span[@class='swatch-label'])[1]") private WebElement COLOUR;
     @FindBy(xpath="(//span[@class='swatch-label'])[8]") private WebElement LSIZE;
     @FindBy(xpath="(//button[@class='button btn-cart'])[2]") private WebElement ADDTOCART;
     @FindBy(xpath="//select[@id='country']") private WebElement COUNTRY;
     @FindBy(xpath="//select[@id='region_id']") private WebElement STATE;
     @FindBy(xpath="//input[@id='postcode']") private WebElement ZIPCODE;
     @FindBy(xpath="(//button[@title='Proceed to Checkout'])[2]") private WebElement PROCEEDTOCHECKOUT;
     @FindBy(xpath="//input[@id='billing:company']") private WebElement COMPANY;
     @FindBy(xpath="//input[@id='billing:street1']") private WebElement ADDRESS;
     @FindBy(xpath="//input[@id='billing:city']") private WebElement CITY;
     @FindBy(xpath="(//input[@title='Zip/Postal Code'])[1]") private WebElement POSTALCODE;
     @FindBy(xpath="//select[@id='billing:country_id']") private WebElement COUNTRY2;
     @FindBy(xpath="//select[@id='billing:region_id']") private WebElement STATE2;
     @FindBy(xpath="(//input[@type='tel'])[1]") private WebElement TELEPHONE;
     @FindBy(xpath="(//button[@title='Continue'])[1]") private WebElement CONTINUE;
     
     public Select_Product(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public void clickmen()
     {
    	 MEN.click();
     }
     
     public void clickshirt()
     {
    	 SHIRT.click();
     }
     
     public void clickcottonshirt()
     {
    	 COTTONSHIRT.click();
     }
     
   


     
     
}
