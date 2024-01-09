package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_UpDown2 {

	 
	   public static void main(String[] args) throws InterruptedException 
	   {
		   
		ChromeOptions co=new ChromeOptions();
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/search;_ylt=AwrKB9AbmBJlZXcKK5O7HAx.;_ylc=X1MDMjExNDcyMzAwMwRfcgMyBGZyA21jYWZlZQRmcjIDc2ItdG9wBGdwcmlkA1JNdlFFcV9WUURlOXpsaS4wM08zYUEEbl9yc2x0AzAEbl9zdWdnAzEwBG9yaWdpbgNpbi5zZWFyY2gueWFob28uY29tBHBvcwMwBHBxc3RyAwRwcXN0cmwDMARxc3RybAM2BHF1ZXJ5A2FtYXpvbgR0X3N0bXADMTY5NTcxODgzOQ--?p=amazon&fr2=sb-top&fr=mcafee&vm=r&type=E210IN885G0");
		
		((JavascriptExecutor)driver).executeScript("window.scroll(0, 1000)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scroll(0, -500)");
		
	}
}
