package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick 
{
	public static void main(String[] args) {
	
     WebDriver driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://www.google.com/search?q=toggle+listbox&sca_esv=596135067&sxsrf=AM9HkKmZ-MOQ8DP74dnrIsMLIzGPCQMPgg%3A1704516238368&source=hp&ei=jtqYZY-IFJ_H4-EP_Iye0As&iflsig=AO6bgOgAAAAAZZjonu-zbnsE41QPjlREpKjvreLf01Wd&ved=0ahUKEwiPh5nn-ceDAxWf4zgGHXyGB7oQ4dUDCAo&uact=5&oq=toggle+listbox&gs_lp=Egdnd3Mtd2l6Ig50b2dnbGUgbGlzdGJveDIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDTIHEAAYgAQYDUiPM1DZAVj9MXACeACQAQCYAcgCoAG7GaoBBjItMTMuMbgBA8gBAPgBAagCCsICBxAjGOoCGCfCAgoQIxiABBiKBRgnwgIEECMYJ8ICEBAuGIAEGIoFGMcBGNEDGCfCAgsQABiABBixAxiDAcICERAuGIAEGLEDGIMBGMcBGNEDwgIFEAAYgATCAggQABiABBixA8ICDhAAGIAEGIoFGLEDGIMBwgIOEC4YgAQYsQMYxwEY0QPCAgsQLhiABBjHARivAcICCxAuGIAEGLEDGIMBwgIHECEYChigAQ&sclient=gws-wiz");
     
     WebElement okay=driver.findElement(By.xpath("(//*[text()='Toggle'])[3]"));
     
     Actions act=new Actions(driver);
     
     act.doubleClick(okay).perform();
     
     
     
     
     
     
     
     
}
}