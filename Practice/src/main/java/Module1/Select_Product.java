package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Product {
	   @FindBy(xpath="(//a[@class='level-top ui-corner-all'])[3]") private WebElement Men;
	   @FindBy(xpath="//a[text()='Hoodies & Sweatshirts']") private WebElement Hoodies;
	   @FindBy(xpath="//div[text()='Size']") private WebElement Size;
	   @FindBy(xpath="(//div[@class='swatch-option text '])[3]") private WebElement M;
	   @FindBy(xpath="//div[text()='Price']") private WebElement Price;
	   @FindBy(xpath="(//div[@class='filter-options-content']//a)[3]") private WebElement Range;
	   @FindBy(xpath="//div[text()='Color']") private WebElement Color;
	   @FindBy(xpath="((//div[@class='swatch-attribute-options clearfix'])[13]//a//div)[1]") private WebElement c1;
	   @FindBy(xpath="(//div[@class='product-item-info'])[2]") private WebElement product;
	   @FindBy(xpath="//div[text()='M']") private WebElement selectsize;
	   @FindBy(xpath="//div[@id='option-label-color-93-item-49']") private WebElement selectcolor;
 
	   @FindBy(xpath="//button[@title='Add to Cart']") private WebElement Addtocart;
	   
	   public Select_Product(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void clickmen()
	   {
		   Men.click();
	   }
	   public void clickhoddies()
	   {
		   Hoodies.click();
	   }
	   public void clicksize()
	   {
		   Size.click();
	   }
	   public void clickm()
	   {
		   M.click();
	   }
	   public void clickprice()
	   {
		   Price.click();
	   }
	   public void clickrange()
	   {
		   Range.click();
	   }
	   public void clickcolor()
	   {
		   Color.click();
	   }
	   public void selectcolor()
	   {
		   c1.click();
	   }
	   public void clickproduct()
	   {
		   product.click();
	   }
	   public void selectsizee()
	   {
		   selectsize.click();
	   }
	   public void selectclr()
	   {
		   selectcolor.click();
	   }
	   public void clickaddtocart()
	   {
		   Addtocart.click();
	   }
	  
	   
}
