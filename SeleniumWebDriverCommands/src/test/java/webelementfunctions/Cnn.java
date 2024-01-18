package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Cnn extends TestBase{

	@Test
	public void testApp() throws InterruptedException {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://cnn.com");
		Boolean b = driver.findElement(By.xpath("//*[@id=\"pageHeader\"]/div/div/div[2]/div/nav[2]/ul/li[4]/a")).isDisplayed();
		System.out.println("Visibility before clicking on humburger: "+b);
		driver.findElement(By.cssSelector("svg.header__menu-icon-svg")).click();
		
		b = driver.findElement(By.xpath("//*[@id=\"pageHeader\"]/div/div/div[2]/div/nav[2]/ul/li[4]/a")).isDisplayed();
		System.out.println("Visibility after clicking on humburger: "+b);
		
		
		driver.findElement(By.xpath("//*[@id=\"pageHeader\"]/div/div/div[2]/div/nav[2]/ul/li[4]/a")).click();
		
		
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
