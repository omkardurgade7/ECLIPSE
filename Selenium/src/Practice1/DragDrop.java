package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	    public static void main(String[] args) throws InterruptedException {
			
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	Thread.sleep(1000);
	    	
	    	driver.get("https://webflow.com/made-in-webflow/website/drag-drop-demo");
	    	Thread.sleep(1000);

	    	WebElement drag=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	    	WebElement drop=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
	    	
	    	Actions act=new Actions(driver);
	    	
	    	act.dragAndDrop(drag, drop).perform();

	    	
	    	
	    	
	    	
	    	
		}	
}