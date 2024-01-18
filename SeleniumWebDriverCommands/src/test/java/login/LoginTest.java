package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTest extends TestBase{

	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
