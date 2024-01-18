package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class LinkedIn extends TestBase{
	
	@Test
	public void linkedin() throws InterruptedException {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		
		String text = driver.findElement(By.xpath("html/body/div/main/div[2]/div/div/p")).getText();
		System.out.println(text);
		
		
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("Rashmi");
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rashmi");
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
