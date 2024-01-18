package downloadandupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.TestBase;

public class americanGolf extends TestBase{

	
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void Shopping() throws InterruptedException{
		//ChromeOptions object
	      ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
	      
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.eu/");
		driver.findElement(By.xpath("//i[@class='icon icon-basket']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
}
