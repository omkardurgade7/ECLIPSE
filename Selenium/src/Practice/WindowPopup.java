package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup {
     
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions CO=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		 Thread.sleep(2000);
		 Set<String> id=driver.getWindowHandles();
		 Thread.sleep(2000);
		 //System.out.println(id);
		 ArrayList<String> store=new  ArrayList<String>(id);
		 String mpid=store.get(0);
		 String wpid=store.get(1);
		 Thread.sleep(2000);
		 //System.out.println(mpid);
		 //System.out.println(wpid);
		 
		 driver.switchTo().window(wpid);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Advertise']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='encodedna.com']")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(mpid);
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[text()='Go back to the Tutorial']")).click();
	}
}
