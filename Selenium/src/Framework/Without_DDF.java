package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF{
public static void main(String[] args) throws InterruptedException
{
		
		ChromeOptions VO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(VO);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Omkar12345");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(1000);
		
		//test case-Verify username
		String expname="Omkar12345!";
		
		//get actual username
		String s1=driver.findElement(By.xpath("//input[@name='username_show']")).getAttribute("value"); //Hello Omkar12345!
		
		String d1[]=s1.split(" ");    //Hello     //Omkar12345!
		
		String g1=d1[0];  //Hello
		String actname=d1[1];  //Omkae12345
		
		/*System.out.println(g1);
		System.out.println(actname);*/
	//now use if else condition
		
		if(expname.equals(actname))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}		
}
}