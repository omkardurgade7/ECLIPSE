package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class test1 
{
  
	    public static void main(String[] args) 
	    {
			// open the browser
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	//maximize the browser
	    	driver.manage().window().maximize();
	    	
	    	//hit the url
	    	driver.get("https://www.newel.com/product/pair-of-carl-malmsten-art-deco-swedish-inlaid-high-back-upholstered-armchairs");
	    	
	    	//click on inquiry button
	    	driver.findElement(By.xpath("(//div[@class='col-md-6 pr-1'])[1]")).click();
	    	
	    	//submit the inquiry form
	    	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Virat");  //first name
	    	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("kohli");   //last name
	    	driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("viratkohli@gmail.com");   //email
	    	driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("1111111111");   //telephone
	    	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Cricket");   //company
	    	driver.findElement(By.xpath("")).sendKeys(""); //
	    	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Automation Script");   //message
	    	//note --> i have skipped test case for capta selection
	    	driver.findElement(By.xpath("")).click();  //click submit button
	    	
	    	driver.navigate().back();
	    	
	    	//Click on the Add to Project and add a new project and then navigate to project and click on check availability 
	    	driver.findElement(By.xpath("(//div[@class='col-md-6 pr-1'])[2]")).click();
	    	driver.findElement(By.xpath("(//a[text()='Create New'])[2]")).click();
	    	
	    	driver.findElement(By.xpath("//button[@class='create-project']")).click();
	    	driver.findElement(By.xpath("//input[@name='project']")).sendKeys("Automation");
	    	
	    	driver.navigate().back();
	    	
	    	driver.findElement(By.xpath("//a[@class='projects-list']")).click();
	    	
	    	driver.findElement(By.xpath("(//button[text()='CHECK AVAILABILITY'])[1]")).click();  //click on check availability button
	    	
	    	//After clicking on check availability submit the contact Information form by filling the fields including dates and click on next
	    	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Virat"); 
	    	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kohli");
	    	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("virat@gmail.com");
	    	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("1111111111");
	    	driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Mumbai");
	    	
	    	//select Country
	    	WebElement country=driver.findElement(By.xpath(""));
	    	Select a1=new Select(country);
	    	a1.selectByVisibleText("India");
	    	
	    	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Mumbai"); //city
	    	driver.findElement(By.xpath("")).sendKeys(""); //Zip code
	    	
	    	//select state
	    	WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
	    	Select a2=new Select(state);
	    	a2.selectByVisibleText("Washington");
	    	
	    	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Criecket");//select company
	    	
	    	//select date
	    	driver.findElement(By.xpath("//input[@name='pick_up']")).click();
	    	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
	    	driver.findElement(By.xpath("//input[@id='return-date']")).click();
	    	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[24]")).click();
	    	
	    	//click on next button
	    	driver.findElement(By.xpath("(//button[@class='btn btn-next'])[1]")).click();
	    	driver.findElement(By.xpath("//button[@class='btn btn-request']")).click();
	  }
}
