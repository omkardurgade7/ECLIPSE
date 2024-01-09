package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Indigo {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions SO=new ChromeOptions();
	WebDriver driver=new ChromeDriver(SO);
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("indigo");
	Thread.sleep(1200);
	
	List<WebElement> suggetion=driver.findElements(By.xpath("//div[@class='aajZCb']//li"));
	
	for(WebElement ind:suggetion)
	{
		String s1=ind.getText();
		if(s1.equals("IndiGo"))
		{
			ind.click();
			break;
		}
	}
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[@href='https://www.goindigo.in/'])[2]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Kolhapur");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Abu Dhabi");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
	Thread.sleep(1000);
	
	String month="September 2023";
	String date="30";
	
    while(true)
    {
    	String s1=driver.findElement(By.xpath("(//div[text()='September 2023']")).getText();
    	if(month.equals(s1))
    	{
    		break;
    	}
    	else
    	{
    		driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
    		Thread.sleep(1000);
    	}
    }
    List<WebElement> kabjanahai=driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[2]/div//div"));
    for(WebElement kal:kabjanahai)
    {
    	String s2=kal.getText();
    	if(date.equals(s2))
    		kal.click();
    	break;
    }

}
}