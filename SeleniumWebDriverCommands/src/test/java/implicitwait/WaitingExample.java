package implicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class WaitingExample extends TestBase{
	
	@Test
	public void linkedin() {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Rashmi");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);
		//dynamic wait
		//global timeout for all driver.findElements
		//wait for some time
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rashmi");
		
		
		
	}

}
