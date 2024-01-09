package Practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestion {
     public static void main(String[] args) throws InterruptedException {
		
    	 
    	 ChromeOptions Co=new ChromeOptions();
    	 WebDriver driver=new ChromeDriver(Co);
    	 
    	 driver.manage().window().maximize();
    	 Thread.sleep(2000);
    	 
    	 driver.get("https://www.google.co.in/");
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("lamborghini");
    	 Thread.sleep(2000);
    	 
    	List<WebElement> lambo = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//div")); 
    	Thread.sleep(2000);
    	
    	for(WebElement car:lambo)
    	{
    		String s1=car.getText();
    		
    		if(s1.equals("lamborghini urus"))
    		{
    			car.click();
    			break;
    			
    		}
    	}
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//img[@alt='lamborghini urus from www.lamborghini.com'])[1]")).click();
    	
    	
    	
	}
}
