package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class UnderstandingClassName extends TestBase{
	
	@Test
	public void testApp() throws InterruptedException {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.flipkart.com/account/login?ret=/");
		//driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("Rashmi");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Rashmi");
		driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys("Rashmi");
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
