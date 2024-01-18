package exercise;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class QTPSelenium_MagicBricksExercise extends TestBase{
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void MagicBricksExercise() throws InterruptedException{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.magicbricks.com/");
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='rentheading']")).click();
		
		//randomly click on any links
		
		//css - div#staticSwiperSliderRent ul.drop-links a
		//xpath - //div[@id="staticSwiperSliderRent"]/descendant::a
		//xpath - //div[@id="staticSwiperSliderRent"]//a
		
		List<WebElement> options = driver.findElements(By.cssSelector("div#staticSwiperSliderRent ul.drop-links a"));
		System.out.println("Size is: "+options.size());
		Random r = new Random();
		int n = r.nextInt(options.size());
		System.out.println(n);
		options.get(n).click();
		Thread.sleep(10000);
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
		
		
	}

}
