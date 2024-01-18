package multipleobjectextraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://edition.cnn.com/");
		System.out.println("Page Title is: "+driver.getTitle());
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("Size of all links: "+allLinks.size());
		
		WebElement fifthLink = allLinks.get(5);
		System.out.println("fifthLink: " +fifthLink.getText());
		System.out.println("fifthLink attribute: "+fifthLink.getAttribute("href"));
		//fifthLink.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("List of links: ");
		for(int i = 0; i<allLinks.size();i++) {
			WebElement link = allLinks.get(i);
			System.out.println(link.isDisplayed());
			System.out.println(link.getText());
		}
		
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
	}
	

}
