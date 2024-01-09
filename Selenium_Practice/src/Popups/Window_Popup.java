package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Popup 
{
	       public static void main(String[] args) {
		
		   ChromeOptions CO=new ChromeOptions();
		   
		   WebDriver driver=new ChromeDriver(CO);
		   
		   driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		   
		   driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		   
		   Set<String> ids=driver.getWindowHandles();
		   
		   ArrayList<String> a1=new ArrayList<String>(ids);
		   
		   ArrayList<String> a2=new ArrayList<String>(ids);
		   
		   String wpid=a1.get(0);
		   
		   String mpid=a2.get(1);
		   
		   driver.switchTo().window(wpid);
		   
		   driver.findElement(By.xpath("(//a[text()='Python for Automation'])[2]")).click();
		   
		   driver.switchTo().window(mpid);
		   
		   driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();   
	}
}
