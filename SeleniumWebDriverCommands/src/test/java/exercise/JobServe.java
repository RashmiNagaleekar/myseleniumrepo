package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class JobServe extends TestBase{

	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void MagicBricksExercise() throws InterruptedException{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://jobserve.com/in/en/Job-Search/");
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-dropdownchecklist-text']")).click();
		driver.findElement(By.xpath("//div[@class='ddcl-selInd-i0-fake fakeInput active']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='ddcl-selInd-i14-fake fakeInput']")).click();//IT & Telecommunications
		driver.findElement(By.xpath("//div[@id=\"pg\"]")).click();//click out side
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"btnSearch\"]")).click();
		Thread.sleep(5000);
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
		
	}
}
