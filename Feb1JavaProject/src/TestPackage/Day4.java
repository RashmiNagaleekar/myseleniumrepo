package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
		@BeforeTest
		public void openBrowser() {
			Driver.get("https://www.google.com/");
		}
		
		
		@Test
		public void testNoParameter() throws InterruptedException {
			String author="Campion";
			String searchKey="Campion";
			WebElement searchText=Driver.findElement(By.name("q"));
			searchText.sendKeys(searchKey);
			//searchText.sendKeys(new String[]{searchText});
			
			System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
            System.out.println("Thread will sleep now");
			
            Thread.sleep(3000);
            System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
            //verifying the value in google search box
            AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
            System.out.println(searchText.getAttribute("value"));
            //AssertJUnit.assertFalse(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
    }
		
		@AfterTest
		public void closeBrowser() {
			Driver.quit();
		}
}
