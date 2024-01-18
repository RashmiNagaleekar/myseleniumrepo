package framesandcookies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class Google extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void google() throws InterruptedException{
				
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("books");
		driver.findElement(By.cssSelector("#c7mM1c > div.wM6W7d > span > b")).click();
	
	
		
		
		
		Thread.sleep(5000);
		driver.quit();//close all windows and end selenium session	
	}
}
