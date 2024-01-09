package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RegisrationPage {

	
	
	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get(("https://demoqa.com/automation-practice-form"));
		 
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Omkar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Durgade");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("omkard@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.className("custom-control-label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Thread.sleep(2000);
		
		Select k1=new Select(month);
		
		k1.selectByIndex(8);
		
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select k2=new Select(year);
		
		k2.selectByVisibleText("1999");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("no subject");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("currentAddress")).sendKeys("india");
		Thread.sleep(2000);
		
		
		
;		
		
		
		
		
		 
}
}