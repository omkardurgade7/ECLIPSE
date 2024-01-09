package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Product 
{
      @FindBy(xpath="") private WebElement ADDTOCART;
      @FindBy(xpath="") private WebElement CART;
      
      public Select_Product(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
      
}
