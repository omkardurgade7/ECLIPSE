package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	     public static void main(String[] args) throws InterruptedException {
			
	    	 ChromeOptions CO=new ChromeOptions();
	    	 WebDriver driver=new ChromeDriver(CO);
	    	 
	    	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    	Thread.sleep(2000);
	    	driver.manage().window().maximize();
	    	Thread.sleep(2000);
	    	
	    	WebElement stalckholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
	    	WebElement sweden=driver.findElement(By.xpath("//div[text()='Sweden']"));
	    	Thread.sleep(2000);
	    	Actions dnd=new Actions(driver);
	    	dnd.dragAndDrop(stalckholm, sweden).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement washington=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	    	WebElement us=driver.findElement(By.xpath("//div[text()='United States']"));
	    	Thread.sleep(2000);
	    	Actions z1=new Actions(driver);
	    	z1.dragAndDrop(washington, us).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement oslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
	    	WebElement norway=driver.findElement(By.xpath("//div[text()='Norway']"));
	    	Thread.sleep(2000);
	    	Actions s1=new Actions(driver);
	    	s1.dragAndDrop(oslo, norway).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement rome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	    	WebElement italy=driver.findElement(By.xpath("//div[text()='Italy']"));
	    	Thread.sleep(2000);
	    	Actions s2=new Actions(driver);
	    	s2.dragAndDrop(rome, italy).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement madrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	    	WebElement spain=driver.findElement(By.xpath("//div[text()='Spain']"));
	    	Thread.sleep(2000);
	    	Actions s3=new Actions(driver);
	    	s3.dragAndDrop(madrid, spain).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement Copenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	    	WebElement Denmark=driver.findElement(By.xpath("//div[text()='Denmark']"));
	    	Thread.sleep(2000);
	    	Actions s4=new Actions(driver);
	    	s4.dragAndDrop(Copenhagen, Denmark).perform();
	    	Thread.sleep(2000);
	    	
	    	WebElement Seoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	    	WebElement SouthKorea=driver.findElement(By.xpath("//div[text()='South Korea']"));
	    	Thread.sleep(2000);
	    	Actions s5=new Actions(driver);
	    	s5.dragAndDrop(Seoul, SouthKorea).perform();
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    	 
		}
}
