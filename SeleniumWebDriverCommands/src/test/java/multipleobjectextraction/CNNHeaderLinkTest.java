package multipleobjectextraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;

public class CNNHeaderLinkTest extends TestBase{

	@SuppressWarnings("deprecation")
	@Test
	public void cnnHeaderLinks() {
		
		//extract all links  - list
		/*
		 * get 1 link
		 * Check the presence, visibility
		 * check response code - 200
		 * click
		 * check - next page Ok
		 * go back
		 */
		//a[@class='header__nav-item-link']
		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://edition.cnn.com/");
		driver.manage().window().maximize();
		List<WebElement> topLinks = driver.findElements(By.xpath("//a[@class='header__nav-item-link']"));
		System.out.println("TopLinks size: "+topLinks.size());
		
		for(int i=0;i<topLinks.size();i++) {
			try {
				
			System.out.println(topLinks.get(i).getText());
			String url = topLinks.get(i).getAttribute("href");
			boolean result = validateResponseCode(url);
			System.out.println("url: "+url);
			//System.out.println("isElementPresent: "+isElementPresent(url));
			//Assert.assertTrue(result, "Invalid Response Code");
			softAssert.assertTrue(result, "Invalid Response Code");
			topLinks.get(i).click();
			System.out.println("Title: "+driver.getTitle());
			//driver.get("https://edition.cnn.com/");
			driver.navigate().back();

			System.out.println("------------------");
			}catch(StaleElementReferenceException e) {
				e.printStackTrace();
				List<WebElement> topLinks1 = driver.findElements(By.xpath("//a[@class='header__nav-item-link']"));
				System.out.println(topLinks1.get(i).getText());
				String url = topLinks1.get(i).getAttribute("href");
				boolean result = validateResponseCode(url);
				//System.out.println("isElementPresent: "+isElementPresent(url));

				//Assert.assertTrue(result, "Invalid Response Code");
				softAssert.assertTrue(result, "Invalid Response Code");
				topLinks1.get(i).click();
				System.out.println("Title: "+driver.getTitle());
				//driver.get("https://edition.cnn.com/");
				driver.navigate().back();
				System.out.println("------------------");
				
			}
		}
			
			softAssert.assertAll();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}
	
	
	public boolean validateResponseCode(String url) {
		int resp_code=0;
		try {
			resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("Response code for url " +url + " is->" +resp_code);
			if(resp_code==200) {
				
				return true;
				
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isElementPresent(String elementXPath) {
		//true - present
		//false - absent
		int s = driver.findElements(By.xpath(elementXPath)).size();
		if(s==0)
			return false;
		if(driver.findElement(By.xpath(elementXPath)).isDisplayed() && driver.findElement(By.xpath(elementXPath)).isEnabled())
			return true;
		else
			return false;
	}
}