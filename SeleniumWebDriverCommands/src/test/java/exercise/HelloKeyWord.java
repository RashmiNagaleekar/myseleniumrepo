package exercise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class HelloKeyWord extends TestBase {

	private static String[] links = null;
	private static int linksCount = 0;
	
	@SuppressWarnings("static-access")
	@Test
	public void toolsqa() throws InterruptedException{
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement m=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	    m.sendKeys("Hello Bengaluru");
	    // type enter with sendKeys method and pass Keys.ENTER
	    m.sendKeys(Keys.ENTER);
	    List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='yuRUbf']/div/a"));
	    System.out.println("Links counts: "+allLinks.size());
		    for(WebElement link:allLinks){
			    //String links = driver.findElement(By.xpath("//div[@class='yuRUbf']/div/a")).getAttribute("href");
			    //System.out.println(links);
			    //driver.get(links);
			    
			    //driver.navigate().back();
		    	try {
		    		System.out.println(link.getText() + " - " + link.getAttribute("href"));
			    	String url = link.getAttribute("href");
			    	driver.get(url);
			    	Thread.sleep(3000);
			    	System.out.println("Title: "+driver.getTitle());
			    	Thread.sleep(3000);
			    	driver.navigate().back();
		    	    
		    	}
		    	catch(org.openqa.selenium.StaleElementReferenceException ex)
		    	{
		    		System.out.println(link.getText() + " - " + link.getAttribute("href"));
			    	String url1 = link.getAttribute("href");
			    	driver.get(url1);
			    	Thread.sleep(3000);
			    	System.out.println("Title: "+driver.getTitle());
			    	Thread.sleep(3000);
			    	driver.navigate().back();

		    	}
		    	
		    }
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
	
}
