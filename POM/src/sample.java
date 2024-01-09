import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample {

	
	
	  public static void main(String[] args) {
		
		  ChromeOptions CO=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(CO);
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCKuBQoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qzQRVcHNESTlzbnBZRnMyMVF3VWxlM2JudzRXVzdBdGk0VUVBSWUyZnUwa2hkN1ZMQS01V0hxcU5MWExwSW5NWkV0ak82alU1S2VXQ0RVMUFpeF9TbXBDdjV5WVU0YmxUTzZ2V1BKZWM0OGFZc1pkcjhDZmQ4emROR0p5SS0yWVhRTW4zZjZEanlwc3c1a2V6aUZLRFhVNklmcnU5ZjhMY1NhY3lNT3Bjel9DWkd4Tktab3ppcXRDRDZheENsNWlnQ182RFBtMmFLR2NYOTFDaGQzek1qa0pQOTN1U3BzYy1RWHNpQzFuZmdzMWVYLWRyb3NWbVI1RGtobTdQbm1EYjkwYXpiRmVDbHFVZnBCNlpmSWd2aXlWVUdDS3E0TXUwQ0dfVVdheExXTkhqSGx3ZnZ6UWNKRzRQRlFWbmREcDdhWk5ZSTBHWmc4WURMcnoyLU9GX1Q1b3NDdTg5bGwwUVVBTG10NkZsSGpBc3NaNW1mWmdFMklibHlqMmdwWmpUUHFiQjQtOXNBNWFkUnZxWHFvcURMdGY1NllsQVV2WDdyeERpTTF6em9Eajg3c0swN19EUXpUYklLOFN6c2FGM2FqRDJkN21sUU84VDJXbDlhYXpzR1ZiUUZXenBsS3VwMWgzSG9VWVVNMzR2a05odkozanNCT0pMN2ZkYlpZTFUzSWZKY3Y2UDNaSl9RYmx1ZjNmenBBWElma0RpOUJPdktCcXpOY3RDT0cqZXlKcFpDSTZJblJ5WVhabGJHeGxjbDlvWldGa1pYSWlmUT09QgRjb2RlKikI0vRwMMePnNbryCY6AEIAWOzp6qgGkgEQdHJhdmVsbGVyX2hlYWRlcg");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("maheshbhatt@gmail.com");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mahesh@123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
	}
}
