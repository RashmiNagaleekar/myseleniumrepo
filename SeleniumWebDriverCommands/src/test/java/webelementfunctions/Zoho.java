package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.TestBase;

public class Zoho extends TestBase{

	
	@Test
	public void testApp() throws InterruptedException {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.zoho.com/signup.html?all_prod_page=true&ireft=nhome&src=home1-header");
		//Thread.sleep(5000);
		
		//Boolean b = driver.findElement(By.xpath("//span[@id='signup-termservice']")).isEnabled();
		Boolean b = driver.findElement(By.xpath("//input[@id='tos']")).isEnabled();
		System.out.println("isEnabled: "+b);
		
		int i = 1;
		while(i<10) {
			if(driver.findElement(By.xpath("//input[@id='tos']")).isEnabled())
				break;
			else
			{
				Thread.sleep(1000);
				i++;
			}
			
		}
		driver.findElement(By.xpath("//input[@id='tos']")).click();
		
		String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("emailfield")).clear();
		System.out.println("Cleared");

		driver.findElement(By.id("emailfield")).sendKeys("Rashmi");
		System.out.println("Entered Rashmi");
		
		
		text = driver.findElement(By.id("emailfield")).getAttribute("value");
		System.out.println("Value of text field: "+text);


		text = driver.findElement(By.xpath("//input[@id='tos']")).getAttribute("checked");
		System.out.println("Checked: "+text);
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
