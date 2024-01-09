package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException 
	{		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
		 
		 driver.get("https://www.jotform.com/build/232133647520449#preview");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 name.sendKeys("Omkar");
		 Thread.sleep(2000);
		 
		 WebElement surname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 surname.sendKeys("Durgade");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_83_0']")).click();
		 Thread.sleep(2000);
		 
		 WebElement month=driver.findElement(By.xpath("//select[@id='input_17_month']"));
		 Select m1=new Select(month); 
		 m1.selectByValue("September");
		 Thread.sleep(2000);
		 
		 WebElement day=driver.findElement(By.xpath("//select[@id='input_17_day']"));
		 Select d1=new Select(day);
		 d1.selectByValue("30");
		 Thread.sleep(2000);
		 
		 WebElement year=driver.findElement(By.xpath("//select[@id='input_17_year']"));
		 Select y1=new Select(year);
		 y1.selectByValue("1999");
		 Thread.sleep(2000);
		 
		 WebElement age=driver.findElement(By.xpath("//input[@id='input_7']"));
		 age.sendKeys("23");
		 Thread.sleep(2000);
		 
		 WebElement height=driver.findElement(By.xpath("//input[@id='input_11']"));
		 height.sendKeys("176.784");
		 Thread.sleep(2000);
		 
		 WebElement weight=driver.findElement(By.xpath("//input[@id='input_10']"));
		 weight.sendKeys("58");
		 Thread.sleep(2000);
		 
		 WebElement t1=driver.findElement(By.xpath("//input[@id='input_37']"));
		 t1.sendKeys("I am Instagram Supervisor");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_103_0']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_104']")).sendKeys("No");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_23']")).sendKeys("No");
	     Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_115_0']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_23']")).sendKeys("Eating Junk foods");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_106']")).sendKeys("No");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_107']")).sendKeys("No");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_108']")).sendKeys("No");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_119']")).sendKeys("Broken Heart");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='input_120']")).sendKeys("No");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_109_0']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_110_1']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_111_1']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_114_1']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("label[@id='label_input_111_1']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_112_1']")).click();//
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_3']")).click();
		 Thread.sleep(1000);;
		 
		 driver.findElement(By.xpath("//label[@id='label_input_39_0']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_0']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_1']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_2']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_3']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_105_4']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_39_0']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_122_0']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_122_1']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_122_2']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_122_3']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@id='label_input_122_4']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='input_22']")).sendKeys("No");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='input_102']")).sendKeys("No");
		 Thread.sleep(1000);
		 
		 
}
}
