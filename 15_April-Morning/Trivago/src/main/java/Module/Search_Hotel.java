package Module;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel 
{
      @FindBy(xpath="//*[@id='input-auto-complete']") private WebElement DESTINATION;
      @FindBy(xpath="(//button[@type='button'])[5]") private WebElement CHECKIN;
      @FindBy(xpath="//h3[text()='October 2023']") private WebElement SELECTCHECKINMONTH;
      @FindBy(xpath="(//time[text()='25'])[2]") private WebElement selectdate;

      @FindBy(xpath="//button[@class='absolute right-0']") private WebElement FORWARD;
      @FindBy(xpath="(//div[@class='grid grid-cols-7  CalendarMonth_scrollWrapper__wErGe px-5 pt-2 gap-y-1'])[1]//button//time") private List<WebElement> SELECTCHECKINDATE;
      @FindBy(xpath="(//button[@type='button'])[6]") private WebElement CHECKOUT;
      @FindBy(xpath="(//time[text()='29'])[2]") private WebElement selectcheckoutdate;

      @FindBy(xpath="//h3[text()='October 2023']") private WebElement SELECTCHECKOUTMONTH;
      @FindBy(xpath="//button[@class='absolute right-0']") private WebElement FORWARD1;
      @FindBy(xpath="//div[@class='grid grid-cols-7  CalendarMonth_scrollWrapper__wErGe px-5 pt-2 gap-y-1']/button/time") private List<WebElement> SELECTCHECKOUTDATE;
      @FindBy(xpath="(//button[@type='button'])[7]") private WebElement ROOMS;
      @FindBy(xpath="//button[text()='Apply']") private WebElement APPLY;
      @FindBy(xpath="(//*[@type='button'])[8]") private WebElement SEARCH;
      
      public Search_Hotel(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
     
      public void enterdestination(String dest)
      {
    	  DESTINATION.sendKeys(dest);
      }
      public void clickchekcindatebutton()
      {
    	  CHECKIN.click();
      }
      public void selectdate()
      {
    	  selectdate.click();
      }
      public void clickcheckoutbutton()
      {
    	CHECKOUT.click();  
      }
      public void selectchechoutdate()
      {
    	  selectcheckoutdate.click();
      }
     /* public void selectcheckinmonth(String expectedinmonth)
      { 
    	  while(true)
    	  {
    		  String actualinmonth=SELECTCHECKINMONTH.getText();
    		  if(expectedinmonth.equals(actualinmonth))
    		  {
    			  break;
    		  }
    	  }
      }
      public void selectcheckindate(String expectedindate)
      {
    	  for(WebElement dd:SELECTCHECKINDATE)
    	  {
    		  String actualindate=((WebElement) SELECTCHECKINDATE).getText();
    		  if(expectedindate.equals(actualindate))
    		  {
    			  dd.click();
    			  break;
    		  }
    	  }
      }

     public void clickcheckout()
      {
    	  CHECKOUT.click();
      }
      public void selectcheckoutmonth(String expectedoutmonth)
      { 
    	  while(true)
    	  {
    		  String actualoutmonth=SELECTCHECKOUTMONTH.getText();
    		  if(expectedoutmonth.equals(actualoutmonth))
    		  {
    			  break;
    		  }
    	  }
      }
      public void selectchrckoutdate(String outdate)
      {
    	  for(WebElement dd:SELECTCHECKOUTDATE)
    	  {
    		  String actualoutdate=((WebElement) SELECTCHECKOUTDATE).getText();
    		  if(outdate.equals(actualoutdate))
    		  {
    			  dd.click();
    			  break;
    		  }
    	  }
      } */
      public void clickroombutton()
      {
    	  ROOMS.click();
      }
      public void clickapplybutton()
      {
    	  APPLY.click();
      }
      public void clicksearchbutton()
      {
    	  SEARCH.click();
      }
}
