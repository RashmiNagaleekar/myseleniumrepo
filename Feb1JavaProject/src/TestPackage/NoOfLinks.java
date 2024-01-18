package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		Driver.findElement(By.xpath("//button[text()='✕']")).click();//clicking on Close button in Login pop-up
		
		List<WebElement> links = Driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i=1;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		Thread.sleep(5000);
		Driver.quit();

	}

}
