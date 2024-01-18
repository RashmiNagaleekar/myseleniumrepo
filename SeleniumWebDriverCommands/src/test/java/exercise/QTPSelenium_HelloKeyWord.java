package exercise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;

public class QTPSelenium_HelloKeyWord extends TestBase{

	
	private static String[] links = null;
	private static int linksCount = 0;
	
	@SuppressWarnings("static-access")
	@Test
	public void testapp() throws InterruptedException{
		String  selection = "Hello google";
		
		
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Hello");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
	    List<WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	    System.out.println("Size of options: "+options.size() );
	    for(WebElement i:options) {
	    	System.out.println(i.getText());
	    	if(i.getText().equalsIgnoreCase(selection)) {
	    		System.out.println("inside if");
		    	System.out.println(i.getText());
		    	i.click();
		    	Thread.sleep(10000);	
		    	break;
	    }
	    
	    }
	    
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
	    
	    
}
