package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.TestBase;

public class faceBook extends TestBase{
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void MagicBricksExercise() throws InterruptedException{
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
		
		driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lkfr7t x1lbecb7 xk50ysn xzsf02u'])[4]")).click();
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}

}
