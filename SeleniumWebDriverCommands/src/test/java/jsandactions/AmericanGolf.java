package jsandactions;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class AmericanGolf extends TestBase{
	
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testAmericanGolf() throws InterruptedException{
				
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("http://americangolf.co.uk");
		WebElement golfClubs = driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(golfClubs).build().perform();//moves mouse  to element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"CLUBS_1\"]/ul/li[1]/ul/li[8]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"CLUBS_1\"]/ul/li[1]/ul/li[8]/a/span")).click();
		waitForPageToLoad();
		//driver.findElement(By.xpath("//div[@id=\"CLUBS_1\"]/ul/li[1]/ul/li[8]/a/span")).click();
		//WebElement e = driver.findElement(By.xpath("(//div[@id=\"secondary\"]/div[1]/div[8]/div/div/div[1]"));
		//scroll to element
		//int y = e.getLocation().y;
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,"+(y-50)+")");
		//act.clickAndHold(e).moveByOffset(100, 0).release().build().perform();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div/ul/li[3]/a")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='CLOTHFOOTW_1']/descendant::a"));
		Random r = new Random();
		int i = r.nextInt(links.size());
		links.get(i).click();
		System.out.println(driver.getTitle());
		waitForPageToLoad();
		
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
	public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i = 0;
		//page to load 100% -- wait for max 20 secs
		while(i!=10) {
			String state = (String)js.executeScript("return document.readyState;");
			System.out.println(state);
			if(state.equals("complete"))
				break;
			else
				Thread.sleep(2000);
			i++;
		}
		//check for jquery/ajax status
		/*
		 i=0;
		 while(i!=10){
			 Long d = (Long)js.executeScript("return JOuery.active;");
			 System.out.println(d);//0-not active, 1-active
			 if(d.longValue()==0)
				 break;
			 else
				 Thread.sleep(2000);
			 i++;
		 
		}
		*/
	}
	
}
