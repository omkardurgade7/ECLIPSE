package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
    public static void main(String[] args) {
		
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.google.com/search?q=current+time+in+india&oq=current+time+in+india&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIHCAEQABiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIGCAYQRRg8MgYIBxBFGDzSAQg1NzI2ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
    	
    	WebElement okay=driver.findElement(By.xpath("((//div[@class='ULSxyf'])[1]//div)[6]"));
    	
    	String s1=okay.getText();
    	
    	System.out.println(s1);
    	
    	driver.close();
    	
    
    
    }
}
