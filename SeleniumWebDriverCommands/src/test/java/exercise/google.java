package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.TestBase;

public class google extends TestBase{
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void SearchNameInGoogle() throws InterruptedException{
		//ChromeOptions object
	      ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
	      
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Rashmi Nagaleekar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page title: "+driver.getTitle());
		Thread.sleep(5000);
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}

}
