package Practice1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup {

	  public static void main(String[] args) throws InterruptedException {
		

		   ChromeOptions SO=new ChromeOptions();
		   WebDriver driver=new ChromeDriver(SO);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@value='Open window in a new tab']")).click();
		   
		   Set<String> id=driver.getWindowHandles();
		   
		   ArrayList<String> a1=new ArrayList<String>(id);
		   
		   String mpid=a1.get(0);
		   String wpid=a1.get(1);
		   
		  /* System.out.println(mpid);
		   System.out.println(wpid); */
		   
		   driver.switchTo().window(wpid);
		   
		   driver.findElement(By.xpath("(//a[text()='Advertise'])[1]")).click();
		   
		   
		   
	  }
}
