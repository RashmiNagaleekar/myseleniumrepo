package exercise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class FBFrdSearch extends TestBase{
	
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void FBFrdFind() throws InterruptedException{
		//ChromeOptions object
	      ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
	      
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("its.nagaleekar@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("BeautyNDBeast123$$");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Rash Nagaleekar')])[1]")));
		System.out.println("1st waited");
		driver.findElement(By.xpath("(//*[contains(text(),'Rash Nagaleekar')])[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'See all friends')]")));
		driver.findElement(By.xpath("//span[contains(text(),'See all friends')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Yatish");
		
		Thread.sleep(10000);
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}


}
