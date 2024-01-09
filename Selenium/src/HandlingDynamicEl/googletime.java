package HandlingDynamicEl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googletime {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		 ChromeOptions CO=new ChromeOptions();	
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		
		 WebDriver  driver=new ChromeDriver(CO); 
   
		 driver.get("https://www.google.com/search?q=google+timing&sca_esv=556540922&ei=uPTYZLCJCb_K1e8Pg5aW6AU&ved=0ahUKEwiwxfvg99mAAxU_ZfUHHQOLBV0Q4dUDCBA&uact=5&oq=google+timing&gs_lp=Egxnd3Mtd2l6LXNlcnAiDWdvb2dsZSB0aW1pbmcyBBAAGEcyBBAAGEcyBBAAGEcyBBAAGEcyBBAAGEcyBBAAGEcyBBAAGEcyBBAAGEdI8QlQ_AZY_AZwAXgCkAEAmAEAoAEAqgEAuAEDyAEA-AEBwgIKEAAYRxjWBBiwA8ICChAAGIoFGLADGEPiAwQYACBB4gMFEgExIECIBgGQBgg&sclient=gws-wiz-serp");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		String time=driver.findElement(By.xpath("((//div[@class='vk_gy vk_sh card-section sL6Rbf'])//div)[1]")).getText();
		System.out.println(time);
		 
		 
	
}
}
