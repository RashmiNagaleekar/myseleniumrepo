package radiobuttonsandscreenshots;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class labcorp extends TestBase{

	
	@SuppressWarnings("deprecation")
	@Test
	public void radio() {
		

		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://patient.labcorp.com/account/registration/register");
		List<WebElement> radios = driver.findElements(By.name("gender"));
		System.out.println("Total radio buttons "+radios.size());
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute("checked"));
		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input"));
		radiobutton.click();
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute("checked"));
		
		//
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		driver.close();
		
	}
}
