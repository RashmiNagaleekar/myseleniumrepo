package singlesScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicBrowsers {
	
	
	@Test
	public void launch() throws InterruptedException {
		
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equals("Chrome")) 
			driver = new ChromeDriver();
		else if(browser.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if(browser.equals("Edge"))
			driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
