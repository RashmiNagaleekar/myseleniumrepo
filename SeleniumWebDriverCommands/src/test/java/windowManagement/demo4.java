package windowManagement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class demo4 extends TestBase{

	@Test
	public void toolsqa() throws InterruptedException
	{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
		for(int i = 0; i < 3; i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}
	 
		Set<String> allWindowHandles = driver.getWindowHandles();
	 
		for(String handle : allWindowHandles)
		{
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
			driver.get("http://google.com");
		}
	}
}