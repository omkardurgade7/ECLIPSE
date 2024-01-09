package Dropdown_ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test13
{
     public static void main(String[] args) {
		
    	 WebDriver driver=new ChromeDriver();
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.facebook.com/");
    	 
    	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    	 
    	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naruto");
    	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("uzumaki");
    	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("99999999");
    	 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Naruto@123");
    	 
    	 WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
    	 Select dd=new Select(date);
    	 dd.selectByVisibleText("6");
    	 
    	 WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
    	 Select mm=new Select(month);
    	 mm.selectByVisibleText("Jan");
    	 
    	 WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
    	 Select yy=new Select(year);
    	 yy.selectByVisibleText("2005");
    	 
    	 driver.findElement(By.xpath("//label[text()='Male']")).click();
    	 
    	 driver.quit();

    	 
    	 
    	 
	}
}
