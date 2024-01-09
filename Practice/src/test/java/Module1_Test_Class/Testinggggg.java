package Module1_Test_Class;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module1.Login;
import Module1.Placeorder;
import Module1.Select_Product;
public class Testinggggg extends Base_Class
{
      Login LoginPage;
      Select_Product product;
      Placeorder pay;
    
	@BeforeClass
	public void openBrowser()
	{
	 initializeBrowser();
	 LoginPage=new Login(driver);
	 product=new Select_Product(driver);
	 pay=new Placeorder(driver);
	 
	}
	@BeforeMethod
	public void LoginToApp() throws IOException
	{
		LoginPage.enteremail(Utility_Class.getdatafromcredentials("USERNAME"));
		LoginPage.enterpassword(Utility_Class.getdatafromcredentials("PASSWORD"));
		LoginPage.clicksignin();
	}
	@Test  //(priority=1)
	public void SelectProuduct()
	{
		product.clickmen();
		product.clickhoddies();
		product.clicksize();
		product.clickm();
		product.clickprice();
		product.clickrange();
		product.clickcolor();
		product.selectcolor();
		product.clickproduct();
		product.selectsizee();
		product.selectclr();
		product.clickaddtocart();
	}
	/*@Test
	public void PLACEORDER() throws EncryptedDocumentException, IOException
	{
	    pay.clickcart();
	    pay.clickcheckout();
	    pay.clickaddress();
	    pay.enterfirstname(Utility_Class.getdatafromexcelsheet(1, 1));
	    pay.enterlastname(Utility_Class.getdatafromexcelsheet(2, 1));
	    pay.entercompany(Utility_Class.getdatafromexcelsheet(4, 1));
	    pay.enteraddress(Utility_Class.getdatafromexcelsheet(5, 1));
	    pay.entercity(Utility_Class.getdatafromexcelsheet(6, 1));
	    pay.selectstate(Utility_Class.getdatafromexcelsheet(7, 1));
	    pay.enterpostalcode(Utility_Class.getdatafromexcelsheet(8, 1));
	    pay.selectcountry(Utility_Class.getdatafromexcelsheet(9, 1));
	    pay.enternumber(Utility_Class.getdatafromexcelsheet(10, 1));
	    pay.clickshiphere();
	    pay.clickshippingmethod();
	    pay.clicknext();
	    pay.clicknext();
	    pay.clickcheckbox();
	    pay.clickplaceorder();
	}*/
	@AfterMethod
	public void logoutfromapp()
	{
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
}
