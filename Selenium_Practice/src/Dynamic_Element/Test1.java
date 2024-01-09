package Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	 public static void main(String[] args) throws InterruptedException {
			

	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.get("https://www.google.com/search?q=cuurent+time&oq=cuurent+time+&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIJCAEQABgKGIAEMgkIAhAAGAoYgAQyCQgDEAAYChiABDIJCAQQABgKGIAEMgkIBRAAGAoYgAQyDAgGEAAYChixAxiABDIJCAcQABgKGIAEMgwICBAAGAoYsQMYgAQyCQgJEAAYChiABNIBCDMwMDhqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
	    	
	    	Thread.sleep(2000);
	    	
	    	WebElement okay=driver.findElement(By.xpath("//div[@class='Ww4FFb vt6azd']//div//div"));
	    	Thread.sleep(2000);
	    	
	    	String s1=okay.getText();
	    	
	    	System.out.println(s1);
	    	
	    	driver.quit();
}
}