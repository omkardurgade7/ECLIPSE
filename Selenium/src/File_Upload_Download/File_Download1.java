package File_Upload_Download;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download1 {

	
	  public static void main(String[] args) {
		
		  ChromeOptions CO=new ChromeOptions();
		  WebDriver driver=new ChromeDriver(CO);
		  String s1=System.getProperty("user.dir")+"\\All_Downloads";
		  
		  //this is default folder we store the files
		  HashMap mp=new HashMap();
		  mp.put("download.default_directory", s1);
		  
		  //set chrome setting 
		  CO.setExperimentalOption("prefs", mp);
		  
		  driver.manage().window().maximize();
		  driver.get("https://github.com/operasoftware/operachromiumdriver/releases");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//span[text()='operadriver_linux64.zip']")).click();
	}
}
