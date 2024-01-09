package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactin_welcome {

	
	  @FindBy(xpath="//input[@name='username_show']") private WebElement usernameshow;
	  @FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	  
	  adactin_welcome(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void usernameverify(String expectedusername)
	  {
		  String s1=usernameshow.getAttribute("value");
		  
		  String a1[]=s1.split(" ");
		  String dd=a1[0];
		  String actualusername=a1[1];
		  
		  if(expectedusername.equals(actualusername))
		  {
			  System.out.println("PASS");
		  }
		  else
		  {
			  System.out.println("FAIL");
		  }
		  
	  }
	  public void logout()
	  {
		  logout.click();
	  }
}
