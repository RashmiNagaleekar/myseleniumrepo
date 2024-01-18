package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.TestBase;

public class DropDown extends TestBase{

	
	@Test
	public void testApp() throws InterruptedException {
		
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.qtpselenium.com/contact-us");
		//select
		//read the selected value
		//total number elements - size
		//print all options
		WebElement dropList = driver.findElement(By.name("country_id"));
		Select s = new Select(dropList); 
		//s.selectByIndex(5);
		
		s.selectByVisibleText("India");
		//s.selectByValue("106");
		WebElement selectOption = s.getFirstSelectedOption();
		System.out.println("Selected option: "+selectOption);
		
		
		Thread.sleep(2000);
		driver.close();
	}
	

}
