package expicitwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class Paytm extends TestBase{

	

	@SuppressWarnings("deprecation")
	@Test
	public void radio() {
		

		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://paytm.com//");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/header/div/div[2]/div/span")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/header/div/div[2]/div/span")));
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[2]/div/span")).click();
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		driver.close();
		
	}
}
