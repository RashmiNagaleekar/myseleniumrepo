package multipleobjectextraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {


	@SuppressWarnings("deprecation")
	@Test
	public void printNames() {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/s?bbn=1968024031&rh=n%3A1571271031%2Cn%3A1968024031%2Cn%3A1968120031&dc&qid=1690901333&rnid=1968024031&ref=lp_1968024031_nr_n_0");
	System.out.println("Page Title is: "+driver.getTitle());
	
	//div[@class='a-section octopus-pc-asin-title']
	List<WebElement> allTshirtNames = driver.findElements(By.xpath("//div[@class='a-section octopus-pc-asin-title']"));
	System.out.println("Size of all links: "+allTshirtNames.size());
	
	List<WebElement> allTshirtPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println("Prices are");
	for(WebElement e:allTshirtNames) {
		System.out.println(e.getText());
	}
	
	System.out.println("List of links: ");
	for( int i = 0;i<allTshirtNames.size();i++) {
		
		System.out.println(allTshirtNames.get(i).getText()+"-------"+allTshirtPrices.get(i).getText());
	}
	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.quit();
	}
	
	
}
