package webelementfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class test extends TestBase{

	@Test
	public void appointmentTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser loading");
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
