package expicitwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class Waiting extends TestBase{
	
	@SuppressWarnings("deprecation")
	@Test
	public void radio() {
		

		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.awwwards.com/sites/creado");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/strong[1]")).click();
		if(isElementPresent("//input(@name='_username']"))
			driver.findElement(By.name("_username")).sendKeys("Rashmi");
		
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		driver.close();
		
	}

	
	public boolean isElementPresent(String elementXPath) {//only for xpath
		//true - present
		//false - absent
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("elementXPath")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("elementXPath")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("elementXPath")));
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}
	
}
