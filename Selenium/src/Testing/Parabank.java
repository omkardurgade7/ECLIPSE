package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Parabank {

	
	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	
		WebElement username=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
		username.sendKeys("Rocky");
		Thread.sleep(2000);
		
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Rocky Bhai");
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
		password.sendKeys("Admin@123");
		Thread.sleep(2000);
		password.clear();
		password.sendKeys("Rocky@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
		firstname.sendKeys("Rock");
		Thread.sleep(2000);
		
		firstname.clear();
		Thread.sleep(2000);
		firstname.sendKeys("Rocky");
		
		Thread.sleep(2000);
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
		
		lastname.sendKeys("Bhoi");
		Thread.sleep(2000);
		
		lastname.clear();
		Thread.sleep(2000);
		
		lastname.sendKeys("bhai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Gali no.420, Lokhandwala");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("400053");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("AAA-GG-SSSS");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Rocky_Bhai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("Rocky@12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("Rocky@12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(2000);
        
		
}}