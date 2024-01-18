package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class MagicBricks extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void MagicBricksExercise() throws InterruptedException{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.magicbricks.com/");
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"rentheading\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[1]/div")).click();//Popular Choices
		WebElement headername = driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[1]/div"));
		System.out.println(headername.getText());
		
		
		
		
		driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[2]/div[1]")).click();//Property Types
		headername = driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[2]/div[1]"));
		System.out.println(headername.getText());
		
		
		driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[3]/div")).click();//Budget
		headername = driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[3]/div"));
		System.out.println(headername.getText());
		
		driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[4]/div")).click();
		headername = driver.findElement(By.xpath("//div[@id=\"staticSwiperSliderRent\"]/div[4]/div"));
		System.out.println(headername.getText());
		
		

		driver.findElement(By.xpath("//div[@id='staticSwiperSliderRent']/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
		
		
	}
	
}
